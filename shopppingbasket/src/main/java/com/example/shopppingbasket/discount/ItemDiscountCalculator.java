package com.example.shopppingbasket.discount;

import com.example.shoppingbasket.order.OrderLine;

public class ItemDiscountCalculator {

	public void calculateDiscount(OrderLine orderLine) {
		if ("Hat".equals(orderLine.getItem())) {
			orderLine.setDiscount(10);
		}
		if (orderLine.getQuantity() == 5) {
			orderLine.setDiscount(20 + orderLine.getDiscount());
		}
		
	}

}
