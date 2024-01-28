package com.example.shoppingbasket.order;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

	private List<OrderLineBuilder> orderLines = new ArrayList<OrderLineBuilder>();
	
	public static OrderBuilder anOrder() {
		return new OrderBuilder();
	}
	
	public static OrderBuilder anOrder(OrderLineBuilder... lines) {
		return new OrderBuilder().withLines(lines);
	}

	private OrderBuilder withLines(OrderLineBuilder... lines) {
		for (OrderLineBuilder line : lines) {
			this.withLine(line);
		}
		return this;
	}

	public OrderBuilder withLine(OrderLineBuilder line) {
		this.orderLines.add(line);
		return this;
	}
	
	public Order build() {
		Order order = new Order();
		for (OrderLineBuilder line : this.orderLines) {
			order.orderLines.add(line.build());
		}
		return order;
	}
}
