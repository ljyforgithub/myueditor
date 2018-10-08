package com.ljy.model;

import java.util.List;

import com.ljy.model.Food;
import com.ljy.model.ShopEnvironment;

public class Shop {
	private String id;
	private String name;
	private String profile;
	private String address;
	private double longitude;
	private double latitude;
	private String phone;
	private String time;
	private int userview;
	private boolean upvote;
	private int star;
	private String url;
	private String region;
	private String food_style;
	private String others;
	private List<Food> foods;
	private List<ShopEnvironment> shopEnvironments;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getLogitude() {
		return longitude;
	}
	public void setLogitude(double logitude) {
		this.longitude = logitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getUserview() {
		return userview;
	}
	public void setUserview(int userview) {
		this.userview = userview;
	}
	public boolean isUpvote() {
		return upvote;
	}
	public void setUpvote(boolean upvote) {
		this.upvote = upvote;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getFood_style() {
		return food_style;
	}
	public void setFood_style(String food_style) {
		this.food_style = food_style;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	public List<ShopEnvironment> getShopEnvironments() {
		return shopEnvironments;
	}
	public void setShopEnvironments(List<ShopEnvironment> shopEnvironments) {
		this.shopEnvironments = shopEnvironments;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", profile=" + profile + ", address=" + address + ", longitude="
				+ longitude + ", latitude=" + latitude + ", phone=" + phone + ", time=" + time + ", userview="
				+ userview + ", upvote=" + upvote + ", star=" + star + ", url=" + url + ", region=" + region
				+ ", food_style=" + food_style + ", others=" + others + ", foods=" + foods + ", shopEnvironments="
				+ shopEnvironments + "]";
	}

}
