package com.example.shopppingbasket.discount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.shoppingbasket.order.OrderLine;
import com.example.shoppingbasket.order.OrderLineBuilder;

import static com.example.shoppingbasket.order.OrderLineBuilder.anOrderLine;

@SpringBootTest
public class ItemDiscountCalculatorTest {

	private ItemDiscountCalculator discountCalculator = new ItemDiscountCalculator();
	
	@Test
	public void test_calulateDiscountRate_noDiscount() {
		OrderLine orderLine = anOrderLine().build();
		discountCalculator.calculateDiscount(orderLine);
		assertEquals(0, orderLine.getDiscount());
	}
	
	@Test
	public void test_calulateDiscountRate_Hat_10PercentDiscount() {
		OrderLine orderLine = anOrderLine().withItem("Hat").build();
		discountCalculator.calculateDiscount(orderLine);
		assertEquals(10, orderLine.getDiscount());
	}
	
	@Test
	public void test_calulateDiscountRate_5Items_20PercentDiscount() {
		OrderLine orderLine = anOrderLine().withQuantity(5).build();
		discountCalculator.calculateDiscount(orderLine);
		assertEquals(20, orderLine.getDiscount());
	}
	
	@Test
	public void test_calulateDiscountRate_5ItemsAndHats_30PercentDiscount() {
		OrderLine orderLine = anOrderLine().withItem("Hat").withQuantity(5).build();
		discountCalculator.calculateDiscount(orderLine);
		assertEquals(30, orderLine.getDiscount());
	}
}