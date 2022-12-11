package com.esafzay.payment;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public boolean pay(BigDecimal amount) throws PaymentFailureException {

        if (amount.compareTo(BigDecimal.ONE) == 0) {
            throw new PaymentFailureException("Paypal payment failed : " + amount);
        }

        System.out.println("Paid through paypal : " + amount);
        return true;
    }
}
