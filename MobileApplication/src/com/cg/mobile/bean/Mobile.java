package com.cg.mobile.bean;

public class Mobile {

	private int mobileId;
	private String name;
	private double price;
	private int quantity;
	
	public Mobile(){}
	
	public Mobile(int mobileId, String name, double price, int quantity) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
