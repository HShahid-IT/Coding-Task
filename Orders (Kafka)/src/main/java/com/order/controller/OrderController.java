package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.kafka.service.KafkaProducerService;
import com.order.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@PostMapping("/getCost")
	public Double getCost(@RequestBody List<String> fruits) {
		return orderService.getCost(fruits);
	}
	
	@PostMapping("/getOffer")
	public List<String> getOffer(@RequestBody List<String> fruits) {
		return orderService.getOffer(fruits);
	}
	
	@PostMapping("/submitOrder")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		kafkaProducerService.sendMessage(message);
	}
}
