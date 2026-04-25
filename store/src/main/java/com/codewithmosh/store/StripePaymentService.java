package com.codewithmosh.store;

public class StripePaymentService implements PaymentService{
    public void processPayment(double amount){
        System.err.println("Stripe");
        System.out.println("Amount: " + amount);
    }
}
