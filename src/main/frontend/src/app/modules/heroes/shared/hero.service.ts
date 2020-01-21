import {Observable, of} from 'rxjs';
import {Injectable, EventEmitter} from '@angular/core';
import {Hero} from './hero.model';
import {map, first} from 'rxjs/operators';
import {MatSnackBar, MatSnackBarConfig} from '@angular/material/snack-bar';
import {LoggerService} from '../../../shared/services/logger.service';
import {AppConfig} from '../../../configs/app.config';
import {I18n} from '@ngx-translate/i18n-polyfill';
import {CookieService} from 'ngx-cookie';

declare var zkbind: any;

@Injectable({
  providedIn: 'root'
})
export class HeroService {
  private binder = zkbind.$('$heroes');
  private heroes: EventEmitter<Hero[]> = new EventEmitter();
  private heroPromise: Promise<Hero>;

  constructor(private snackBar: MatSnackBar,
              private i18n: I18n,
              private cookieService: CookieService) {
                // prepare promise
                this.initPromise();
                // bind the callback
                this.binder.after('updateHero', (data) => {
                  this.heroes.emit(data);
                });
  }

  initPromise() {
    this.heroPromise = new Promise<Hero>((resolve, reject) => {
      let fn = (data) => {
        resolve(data);
        this.binder.unAfter('updateHero', fn);
        this.initPromise();
      }
      this.binder.after('updateHero', fn);
    })
  }

  checkIfUserCanVote(): boolean {
    const votes = this.cookieService.get('votes');
    return Number(votes ? votes : 0) < AppConfig.votesLimit;
  }

  
  getHeroes(): Observable<Hero[]> {
    this.binder.command('reload');
    return this.heroes.pipe(
      map((actions) => {
        return actions.map((action: any) => {
          return new Hero({...action});
        });
      })
    );
  }

  getHero(id: string): Observable<any> {
    this.binder.command('reload', {'id': id});
    return this.heroes.pipe(
      map((hero) => {
        return new Hero({id, ...hero[0]});
      }),
      first()
    );
  }

  createHero(hero: Hero): Promise<Hero> {
      this.binder.command('add', hero);
      return this.heroPromise;
  }

  updateHero(hero: Hero): Promise<void> {
    this.binder.command('update', hero);
    return this.heroPromise.then(() => {
        LoggerService.log(`updated hero w/ id=${hero.id}`);
        this.showSnackBar(this.i18n({value: 'Saved', id: '@@saved'}));
      });
  }

  deleteHero(id: string): Promise<any> {
    this.binder.command('delete', {'id': id});
    return this.heroPromise;
  }

  showSnackBar(name): void {
    const config: any = new MatSnackBarConfig();
    config.duration = AppConfig.snackBarDuration;
    this.snackBar.open(name, 'OK', config);
  }
}
