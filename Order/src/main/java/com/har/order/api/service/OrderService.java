package com.har.order.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.har.order.api.common.Payment;
import com.har.order.api.common.TransactionRequest;
import com.har.order.api.common.TransactionResponse;
import com.har.order.api.entity.Order;
import com.har.order.api.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	@Autowired
	private RestTemplate template;

	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		Order order = transactionRequest.getOrder();
		repository.save(order);
		Payment payment=transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		Payment paymentResponse=template.postForObject("http://PaymentService/payment/doPayment", payment, Payment.class);
		String response=("success".equals(paymentResponse.getPaymentStatus()))?"Payment Processing successful and Order Placed":"there is a failure in the paymenet API order added to cart";
		return new TransactionResponse(order,paymentResponse.getTransId(),paymentResponse.getAmount(),response);
	}
}
