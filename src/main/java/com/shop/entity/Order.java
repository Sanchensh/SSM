package com.shop.entity;

import java.util.Date;

public class Order {
	private int orderID;
	private int shopkeeperId;
	private int buyerID;
	private boolean isPay;
	private String deliver;
	private Date orderTime;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getShopkeeperId() {
		return shopkeeperId;
	}

	public void setShopkeeperId(int shopkeeperId) {
		this.shopkeeperId = shopkeeperId;
	}

	public int getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(int buyerID) {
		this.buyerID = buyerID;
	}

	public boolean isPay() {
		return isPay;
	}

	public void setPay(boolean isPay) {
		this.isPay = isPay;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderID, int shopkeeperId, int buyerID, boolean isPay, String deliver, Date orderTime) {
		super();
		this.orderID = orderID;
		this.shopkeeperId = shopkeeperId;
		this.buyerID = buyerID;
		this.isPay = isPay;
		this.deliver = deliver;
		this.orderTime = orderTime;
	}

}
