package com.lqw.springcloud.service;

import com.lqw.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById( Long id);
}

