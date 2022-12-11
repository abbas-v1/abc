package com.esafzay.payment;

public class SimplePaymentFactory {

    public static PaymentStrategy getPaymentStrategy(String paymentMethod) {
        switch (paymentMethod) {
            case "credit":
                return new CreditCardPayment();

            case "paypal":
                return new PaypalPayment();

            default:
                throw new RuntimeException("Unknown payment strategy");
        }
    }
}
