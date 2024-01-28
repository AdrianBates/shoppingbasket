package com.example.shoppingbasket.order;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Data;

@Data
public class OrderLine {
	
	private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;

	private static int DECIMALS = 2;	
	
	private int quantity;
	private String item;
	private int unitPrice;
	private int discount;
	
	public BigDecimal getTotalPrice() {
		BigDecimal tot = new BigDecimal(unitPrice * quantity);
		BigDecimal discountRate = new BigDecimal((100.0 - discount)/100.0);
		return tot.multiply(discountRate).setScale(DECIMALS, ROUNDING_MODE);
	}
}
