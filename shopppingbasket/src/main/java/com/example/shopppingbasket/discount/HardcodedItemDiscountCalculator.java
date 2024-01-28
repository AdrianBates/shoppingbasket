package com.example.shopppingbasket.discount;

import org.springframework.stereotype.Component;

import com.example.shoppingbasket.order.OrderLine;

@Component
public class HardcodedItemDiscountCalculator implements ItemDiscountCalculator {

	@Override
	public void calculateDiscount(OrderLine orderLine) {
		if ("Hat".equals(orderLine.getItem())) {
			orderLine.setDiscount(10);
		}
		if (orderLine.getQuantity() == 5) {
			orderLine.setDiscount(20 + orderLine.getDiscount());
		}
		
	}

}
