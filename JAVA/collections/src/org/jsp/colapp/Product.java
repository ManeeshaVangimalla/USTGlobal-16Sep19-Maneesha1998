package org.jsp.colapp;

public class Product {
	private int qty;
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String type;
	private int price;
	
	 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.type+" product quantity is "+this.qty+ "and price is "+this.price;
	
	 }}

