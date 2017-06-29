package com.shop.entity;

import java.util.Date;

public class Book {
	private int bookID;
	private String bookName;
	private int shopkeeperID;
	private String publisher;
	private String bookType;
	private String bookPic;
	private String bookBref;
	private String bookCount;
	private Date soldTime;
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getShopkeeperID() {
		return shopkeeperID;
	}

	public void setShopkeeperID(int shopkeeperID) {
		this.shopkeeperID = shopkeeperID;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookPic() {
		return bookPic;
	}

	public void setBookPic(String bookPic) {
		this.bookPic = bookPic;
	}

	public String getBookBref() {
		return bookBref;
	}

	public void setBookBref(String bookBref) {
		this.bookBref = bookBref;
	}

	public String getBookCount() {
		return bookCount;
	}

	public void setBookCount(String bookCount) {
		this.bookCount = bookCount;
	}

	public Date getSoldTime() {
		return soldTime;
	}

	public void setSoldTime(Date soldTime) {
		this.soldTime = soldTime;
	}

	public Book() {
	}
	public Book(int bookID, String bookName, int shopkeeperID, String publisher, String bookType, String bookPic, String bookBref, String bookCount, Date soldTime) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.shopkeeperID = shopkeeperID;
		this.publisher = publisher;
		this.bookType = bookType;
		this.bookPic = bookPic;
		this.bookBref = bookBref;
		this.bookCount = bookCount;
		this.soldTime = soldTime;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookID=" + bookID +
				", bookName='" + bookName + '\'' +
				", shopkeeperID=" + shopkeeperID +
				", publisher='" + publisher + '\'' +
				", bookType='" + bookType + '\'' +
				", bookPic='" + bookPic + '\'' +
				", bookBref='" + bookBref + '\'' +
				", bookCount='" + bookCount + '\'' +
				", soldTime=" + soldTime +
				'}';
	}
}
