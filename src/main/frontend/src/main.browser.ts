import {enableProdMode, MissingTranslationStrategy} from '@angular/core';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';

import {AppBrowserModule} from './app/app.browser.module';
import {environment} from './environments/environment';

if (environment.production) {
  enableProdMode();
}
// zk afterMount
window['zk'].afterMount( () => {
  platformBrowserDynamic().bootstrapModule(AppBrowserModule, {
    missingTranslation: MissingTranslationStrategy.Error,
  }).then(() => {
    if ('serviceWorker' in navigator && environment.production) {
      navigator.serviceWorker.register('./ngsw-worker.js');
    }
  }).catch(err => console.log(err));
});
