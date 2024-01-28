package com.example.shopppingbasket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.shoppingbasket.order.OrderLine;
import com.example.shopppingbasket.discount.ItemDiscountCalculator;

@Component
public class ShoppingBasketMain implements CommandLineRunner {
	
	private final ItemDiscountCalculator calculator;
	
	@Autowired
	ShoppingBasketMain(ItemDiscountCalculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run(String... args) throws Exception {
		OrderLine orderLine = new OrderLine();
		orderLine.setItem("Hat");
		orderLine.setQuantity(1);
		orderLine.setUnitPrice(300);
		
		calculator.calculateDiscount(orderLine );
		System.out.println("Total cost of order : " + orderLine.getTotalPrice());
	}

}
