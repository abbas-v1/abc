package com.esafzay.payment;

import java.math.BigDecimal;

public interface PaymentStrategy {

    boolean pay(BigDecimal amount) throws PaymentFailureException;

}
