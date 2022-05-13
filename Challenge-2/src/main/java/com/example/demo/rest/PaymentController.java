package com.example.demo.rest;

import com.example.demo.domain.Payment;
import com.example.demo.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Challenge/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> findAll(){
        return paymentService.findAll();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }

    @PutMapping
    public Payment update(@RequestBody Payment payment){
        return paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    public void  delete(@PathVariable String id){
        paymentService.delete(id);
    }
}
