package com.shop.entity;

public class Buyer {
	private int buyerID;
	private String buyerName;
	private String password;

	public int getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Buyer(int buyerID, String buyerName, String password) {
		super();
		this.buyerID = buyerID;
		this.buyerName = buyerName;
		this.password = password;
	}

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
