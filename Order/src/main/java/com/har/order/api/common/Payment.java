package com.har.order.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	private int paymentId;
	private String paymentStatus;
	private String transId;
	private int orderId;
	private double amount;
}
