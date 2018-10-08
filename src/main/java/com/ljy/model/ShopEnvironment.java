package com.ljy.model;


public class ShopEnvironment {
	
	private String id;
	private String name;
	private String image_url;
	private String shop_id;
	private Shop shop;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "ShopEnvironment [id=" + id + ", name=" + name + ", image_url=" + image_url + ", shop_id=" + shop_id
				+ ", shop=" + shop + "]";
	}

}
