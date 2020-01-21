/* Hero.java

		Purpose:
		
		Description:
		
		History:
				Thu Jan 09 11:50:12 CST 2020, Created by leon

Copyright (C) 2020 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zkangular8.hero;

public class Hero {
	private String id;
	private String name;
	private String alterEgo;
	private Integer likes;
	private boolean _default;
	private String avatarUrl;
	private String avatarBlurredUrl;
	private String avatarThumbnailUrl;

	public Hero() {
	}

	public Hero(String id, String name, String alterEgo) {
		this.id = id;
		this.name = name;
		this.alterEgo = alterEgo;
		this.likes = 0;
	}

	public Hero(String id, String name, String alterEgo, Integer likes, boolean _default, String avatarUrl, String avatarBlurredUrl, String avatarThumbnailUrl) {
		this.id = id;
		this.name = name;
		this.alterEgo = alterEgo;
		this.likes = likes;
		this._default = _default;
		this.avatarUrl = avatarUrl;
		this.avatarBlurredUrl = avatarBlurredUrl;
		this.avatarThumbnailUrl = avatarThumbnailUrl;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlterEgo() {
		return this.alterEgo;
	}

	public void setAlterEgo(String alterEgo) {
		this.alterEgo = alterEgo;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public boolean getDefault() {
		return this._default;
	}

	public void setDefault(boolean _default) {
		this._default = _default;
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarBlurredUrl() {
		return this.avatarBlurredUrl;
	}

	public void setAvatarBlurredUrl(String avatarBlurredUrl) {
		this.avatarBlurredUrl = avatarBlurredUrl;
	}

	public String getAvatarThumbnailUrl() {
		return this.avatarThumbnailUrl;
	}

	public void setAvatarThumbnailUrl(String avatarThumbnailUrl) {
		this.avatarThumbnailUrl = avatarThumbnailUrl;
	}
}
