package com.esafzay.payment;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("Paid through credit card : " + amount);
        return true;
    }
}
