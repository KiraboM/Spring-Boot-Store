package com.codewithmosh.store;

public class PayPalPaymentService implements PaymentService{
    public void processPayment(double amount){
        System.err.println("PayPal");
        System.out.println("Amount: " + amount);
    }
}
