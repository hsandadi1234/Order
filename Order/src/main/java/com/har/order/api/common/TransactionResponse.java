package com.har.order.api.common;

import com.har.order.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
	private Order order;
	private String transId;
	private double amt;
	private String message;
}
