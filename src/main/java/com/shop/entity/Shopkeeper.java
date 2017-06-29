package com.shop.entity;

public class Shopkeeper {
	private int shopkeeperID;
	private String shopkeeperName;
	private String password;
	private boolean hasRoot;

	public int getShopkeeperID() {
		return shopkeeperID;
	}

	public void setShopkeeperID(int shopkeeperID) {
		this.shopkeeperID = shopkeeperID;
	}

	public String getShopkeeperName() {
		return shopkeeperName;
	}

	public void setShopkeeperName(String shopkeeperName) {
		this.shopkeeperName = shopkeeperName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasRoot() {
		return hasRoot;
	}

	public void setHasRoot(boolean hasRoot) {
		this.hasRoot = hasRoot;
	}

	public Shopkeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopkeeper(int shopkeeperID, String shopkeeperName, String password, boolean hasRoot) {
		super();
		this.shopkeeperID = shopkeeperID;
		this.shopkeeperName = shopkeeperName;
		this.password = password;
		this.hasRoot = hasRoot;
	}

}
