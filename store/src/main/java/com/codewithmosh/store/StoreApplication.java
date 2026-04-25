package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StoreApplication.class, args);
		OrderService orderService = new OrderService(new StripePaymentService());
		orderService.placeOrder();
		OrderService payPalOrderService = new OrderService(new PayPalPaymentService());
		payPalOrderService.placeOrder();
	}

}
