package com.ljy.model;

public class Food {
	private int  id;
	private String name;
	private String profile;
	private String image_url;
	private String shop_id;
	private Shop shop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getShop_id() {
		return shop_id;
	}
	public void setShopid(String shopid) {
		this.shop_id = shopid;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", profile=" + profile + ", url=" + image_url + ", shopid=" + shop_id
				+ ", shop=" + shop + "]";
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

}
