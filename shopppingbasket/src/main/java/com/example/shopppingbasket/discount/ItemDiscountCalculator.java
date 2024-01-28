package com.example.shopppingbasket.discount;

import com.example.shoppingbasket.order.OrderLine;

public interface ItemDiscountCalculator {

	public void calculateDiscount(OrderLine orderLine);

}