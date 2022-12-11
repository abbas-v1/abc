package com.esafzay.payment;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PaymentApp {

    public static void main(String[] args) {

        Map<String, BigDecimal> splitPayment = Map.of(
                "credit", BigDecimal.TEN,
                "paypal", BigDecimal.ONE
        );

        new PaymentApp().pay(splitPayment);
    }

    private void pay(Map<String, BigDecimal> splitPayment) {

        Map<PaymentStrategy, BigDecimal> donePayments = new HashMap<>();

        splitPayment.forEach((method, amount) -> {

            PaymentStrategy paymentMethod = SimplePaymentFactory.getPaymentStrategy(method);

            if (pay(paymentMethod, amount)) {
                donePayments.put(paymentMethod, amount);
            }
        });

        if (splitPayment.size() != donePayments.size()) {
            revertPayments(donePayments);
        }
    }

    private void revertPayments(Map<PaymentStrategy, BigDecimal> donePayments) {
        donePayments.forEach((paymentStrategy, amount) -> pay(paymentStrategy, amount.negate()));
    }

    private static boolean pay(PaymentStrategy paymentStrategy, BigDecimal amount) {
        try {
            paymentStrategy.pay(amount);
            return true;

        } catch (PaymentFailureException e) {
            System.out.println("Payment failed : " + amount);
            return false;
        }
    }


}
