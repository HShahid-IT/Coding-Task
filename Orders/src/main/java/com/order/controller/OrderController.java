package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/getCost")
	public Double getCost(@RequestBody List<String> fruits) {
		return orderService.getCost(fruits);
	}
	
	@PostMapping("/getOffer")
	public List<String> getOffer(@RequestBody List<String> fruits) {
		return orderService.getOffer(fruits);
	}
}
