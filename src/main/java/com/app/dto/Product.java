package com.app.dto;

public class Product {
	public String id;
	public String name;
	private int price;
	
	public void setPrice(int price) {
		if(price < 0)
			price = 0;
	}

	public int getPrice() {
		return price;
	}
}
