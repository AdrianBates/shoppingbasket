package com.example.shoppingbasket.order;

import lombok.Data;

@Data
public class OrderLine {
	
	private int quantity;
	private String item;
	private int unitPrice;
	private int discount;
	
	public int getTotalPrice() {
		return unitPrice * quantity;
	}
}
