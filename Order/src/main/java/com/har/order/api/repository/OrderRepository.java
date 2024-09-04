package com.har.order.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.har.order.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
