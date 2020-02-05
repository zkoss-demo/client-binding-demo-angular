/* HeroDao.java

		Purpose:
		
		Description:
		
		History:
				Thu Jan 09 12:02:43 CST 2020, Created by leon

Copyright (C) 2020 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zkangular8.hero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class HeroDao {
	private ArrayList<Hero> heroes = new ArrayList<Hero>();

	{
		heroes.add(new Hero("o0OFH4ddtfekOwK3ZKds", "Thor", "Donald Blake", 34634, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fo0OFH4ddtfekOwK3ZKds.jpg?alt=media&token=7cdac0a0-ac21-4203-943e-1cabe0c71f4c",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fo0OFH4ddtfekOwK3ZKds-blurred.jpg?alt=media&token=61c07324-17ed-40cf-b3b5-187181f0fdc4",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fo0OFH4ddtfekOwK3ZKds-thumbnail.jpeg?alt=media&token=c39680fe-be8a-408f-89aa-bc4a2fd99ce7"));
		heroes.add(new Hero("z6jX346az6e6QifVj1Yd", "Wonder Woman", "Gal Gadot", 3688, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fz6jX346az6e6QifVj1Yd.jpg?alt=media&token=3cbe10ed-590f-4ca6-b088-0f927d53730d",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fz6jX346az6e6QifVj1Yd-blurred.jpg?alt=media&token=028f99b7-ac1f-4ad0-9a1b-00ec95ff86d3",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2Fz6jX346az6e6QifVj1Yd-thumbnail.jpg?alt=media&token=bbd1720c-9003-4119-bb72-c0bc03b6412c"));
		heroes.add(new Hero("F5hmxqgXg4iTRiIwRZg1", "Captain America", "Steven Grant Rogers", 2365, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FF5hmxqgXg4iTRiIwRZg1.jpg?alt=media&token=067e4743-a2a4-4025-964e-f7cc29039c30",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FF5hmxqgXg4iTRiIwRZg1-blurred.jpg?alt=media&token=fa2a5d55-2771-4063-9842-660ddf4e7a18",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FF5hmxqgXg4iTRiIwRZg1-thumbnail.jpg?alt=media&token=3e997726-6b39-4377-84d3-cbe11458e6f5"));
		heroes.add(new Hero("LLypN0gLgrU9ZizUlZqX", "Iron man", "Tony Stark", 1076, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FLLypN0gLgrU9ZizUlZqX.jpg?alt=media&token=a4fba4e9-1b60-4b68-a96a-ab4a6dae6285",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FLLypN0gLgrU9ZizUlZqX-blurred.jpg?alt=media&token=0887df34-4af3-475d-a861-7bc841db03b0",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FLLypN0gLgrU9ZizUlZqX-thumbnail.jpg?alt=media&token=1fbaa9d1-b68d-4f4e-b1a1-1b480ceacef2"));
		heroes.add(new Hero("oWqFo97IT3buqO2iLS3F", "Deadpool", "Wade Winston Wilson", 543, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FoWqFo97IT3buqO2iLS3F.jpg?alt=media&token=e10fbb36-69da-4ca7-8e89-35ddef3dfa28",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FoWqFo97IT3buqO2iLS3F-blurred.jpg?alt=media&token=36d0e511-a879-4e74-9c57-29749cf50a10",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FoWqFo97IT3buqO2iLS3F-thumbnail.jpg?alt=media&token=f3786a90-eaf2-4c9a-bb50-4f5f6c41ab6c"));
		heroes.add(new Hero("BzTvl77YsRTtdihH0jeh", "Batman", "Bruce Wayne", 299, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FBzTvl77YsRTtdihH0jeh.jpg?alt=media&token=6a9baa26-926a-48a4-9cb8-8457077a9c0e",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FBzTvl77YsRTtdihH0jeh-blurred.jpg?alt=media&token=c5a389a6-a2e4-439c-afda-73e5b29411de",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FBzTvl77YsRTtdihH0jeh-thumbnail.jpg?alt=media&token=4340a256-144a-455b-896a-bfa2962ede70"));
		heroes.add(new Hero("cFiPzbhKt1zVVThrb9EH", "Spiderman", "Peter Parker", 266, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FcFiPzbhKt1zVVThrb9EH.jpg?alt=media&token=35d1cdd9-f1f2-416b-90d4-6bcba2e72305",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FcFiPzbhKt1zVVThrb9EH-blurred.jpg?alt=media&token=803d6a36-663b-47b7-aaa5-f9382f63317f",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FcFiPzbhKt1zVVThrb9EH-thumbnail.jpg?alt=media&token=dbdcd583-1851-46ad-bd23-df68ca37467e"));
		heroes.add(new Hero("0kr9Xs2UNAMtxw3O6TFZ", "Superman", "Clark Kent", 228, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2F0kr9Xs2UNAMtxw3O6TFZ.jpg?alt=media&token=8217c36a-5f15-46a5-9607-e4d329b9f589",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2F0kr9Xs2UNAMtxw3O6TFZ-blurred.jpg?alt=media&token=404f5ef9-2f12-4779-9a2a-3e38ebb57bf7",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2F0kr9Xs2UNAMtxw3O6TFZ-thumbnail.jpg?alt=media&token=d18bcf98-a3dc-47e8-83dc-ffd265c06dc4"));
		heroes.add(new Hero("VajTPSd8NLy2bxGXydY4", "Hulk", "Bruce Banner", 227, true,
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FVajTPSd8NLy2bxGXydY4.jpg?alt=media&token=6d8ab120-fd53-4af0-9069-1c97390f26bf",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FVajTPSd8NLy2bxGXydY4-blurred.jpg?alt=media&token=164772f4-eaee-4560-a398-347a13554b3e",
				"https://firebasestorage.googleapis.com/v0/b/ismaestro-angularexampleapp.appspot.com/o/heroes-images%2FVajTPSd8NLy2bxGXydY4-thumbnail.jpg?alt=media&token=cec325f7-0e90-4565-b6d4-754cf58614fb"));
	}

	public List<Hero> queryAll() {
		return new LinkedList<Hero>(heroes);
	}

	public Hero queryById(String id) {
		Hero result = null;
		for (Hero h : heroes) {
			if (h.getId().equals(id)) {
				result = h;
			}
		}
		return result;
	}

	public Hero create(String name, String alterEgo) {
		Hero hero = new Hero(UUID.randomUUID().toString(), name, alterEgo);
		heroes.add(hero);
		return hero;
	}

	public void update(String id, Integer likes) {
		Hero hero = queryById(id);
		if (hero != null)
			hero.setLikes(likes);
	}

	public void remove(String id) {
		Hero hero = queryById(id);
		if (hero != null)
			heroes.remove(hero);

	}

}
