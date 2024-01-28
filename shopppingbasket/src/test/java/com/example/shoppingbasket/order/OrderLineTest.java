package com.example.shoppingbasket.order;

import static com.example.shoppingbasket.order.OrderLineBuilder.anOrderLine;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class OrderLineTest {
	
	private OrderLineBuilder orderLine = anOrderLine().withQuantity(1).withUnitPrice(10);

	@Test
	public void test_getTotalPrice() {
		assertEquals(new BigDecimal("10.00"), orderLine.build().getTotalPrice());
	}
	
	@Test
	public void test_getTotalPrice_WithDiscount() {
		orderLine.withDiscount(10);
		assertEquals(new BigDecimal("9.00"), orderLine.build().getTotalPrice());
	}
}
