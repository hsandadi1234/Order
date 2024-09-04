package com.har.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.har.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
