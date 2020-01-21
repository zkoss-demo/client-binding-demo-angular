/* HeroVM.java

		Purpose:
		
		Description:
		
		History:
				Thu Jan 09 12:24:17 CST 2020, Created by leon

Copyright (C) 2020 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zkangular8.hero;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.NotifyCommand;
import org.zkoss.bind.annotation.ToClientCommand;
import org.zkoss.bind.annotation.ToServerCommand;
import org.zkoss.zk.ui.util.Clients;

@NotifyCommand(value = "updateHero", onChange = "_vm_.heroes")
@ToClientCommand({"updateHero"})
@ToServerCommand({"reload", "delete", "add", "update"})
public class HeroVM {
	private HeroDao dao = new HeroDao();
	private List<Hero> heroes;

	@Command
	@NotifyChange("heroes")
	public void reload(@BindingParam("id") String id) {
		if (id == null) {
			heroes = dao.queryAll();
		} else {//query one
			Hero selected = null;
			for (Hero p : heroes) {
				if (p.getId().equals(id)) {
					selected = p;
					break;
				}
			}
			heroes.clear();
			heroes.add(selected);
		}
	}

	@Command
	@NotifyChange("heroes")
	public void delete(@BindingParam("id") String id) {
		dao.remove(id);
		reload(null);
	}

	@Command
	@NotifyChange("heroes")
	public void add(@BindingParam("name") String name, @BindingParam("alterEgo") String alterEgo) {
		heroes.add(dao.create(name, alterEgo));
	}

	@Command
	@NotifyChange("heroes")
	public void update(@BindingParam("id") String id, @BindingParam("likes") Integer likes) {
		dao.update(id, likes);
	}

	public List<Hero> getHeroes() {
		return heroes;
	}

	public void setHeroes(ArrayList<Hero> heroes) {
		this.heroes = heroes;
	}

}
