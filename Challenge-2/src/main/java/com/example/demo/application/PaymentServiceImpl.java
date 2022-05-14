package com.example.demo.application;

import com.example.demo.domain.Payment;
import com.example.demo.domain.PaymentRepository;
import com.example.demo.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        Optional<Payment> optionalPayment = paymentRepository.findById(payment.getId());
        if (!optionalPayment.isPresent()) throw new RuntimeException("No se encontro el payment");
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(String id) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (!optionalPayment.isPresent()) throw new RuntimeException("No se encontro el payment");
        paymentRepository.deleteById(id);
    }
}
