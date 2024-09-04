package com.har.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.har.ps.api.entity.Payment;
import com.har.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repository;

	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymenetProcessing());
		payment.setTransId(UUID.randomUUID().toString());;
		return repository.save(payment);
	}
	public String paymenetProcessing() {
		return new Random().nextBoolean() ? "success" : "fail";
	}
}
