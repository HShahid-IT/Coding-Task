package com.order.service;

import java.util.List;

public interface OrderService {

	Double getCost(List<String> fruits);

	List<String> getOffer(List<String> fruits);
}
