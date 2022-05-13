package com.example.demo.domain;


import java.util.List;

public interface PaymentService {

    List<Payment> findAll();

    Payment create(Payment payment);

    Payment update(Payment payment);

    void delete(String id);
}
