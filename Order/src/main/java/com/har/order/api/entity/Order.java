package com.har.order.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int qty;
	private double price;
}
