package com.example.shoppingbasket.order;

public class OrderLineBuilder {
	
	private int quantity = 1;
	private String item = "a hat";
	private int unitPrice = 10;
	private int discount = 0;
	
	public static OrderLineBuilder anOrderLine() {
		return new OrderLineBuilder();
	}
	
	public OrderLineBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	public OrderLineBuilder withItem(String item) {
		this.item = item;
		return this;
	}
	
	public OrderLineBuilder withUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}
	
	public OrderLineBuilder withDiscount(int discount) {
		this.discount = discount;
		return this;
	}
	
	public OrderLine build() {
		OrderLine orderLine = new OrderLine();
		orderLine.setQuantity(quantity);
		orderLine.setItem(item);
		orderLine.setUnitPrice(unitPrice);
		orderLine.setDiscount(discount);
		return orderLine;
	}
}
