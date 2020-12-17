package com.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public Double getCost(List<String> fruits) {
		double d = 0;
		for(String fruit: fruits) {
			if(fruit.equals("Apple")) {
				d +=0.6;
			}
			if(fruit.equals("Orange")) {
				d +=0.25;
			}
		}
		return d;
	}

	@Override
	public List<String> getOffer(List<String> fruits) {
		List<String> offers = new ArrayList<String>();
		int i =0;
		for(String fruit: fruits) {
			if(fruit.equals("Apple")) {
				offers.add("Apple");offers.add("Apple");
			}
			if(fruit.equals("Orange")) {
				i++;
			}
			if(i==2) {
				offers.add("Orange");offers.add("Orange");offers.add("Orange");
				i=0;
			}
		}
		if(i==2) {
			offers.add("Orange");offers.add("Orange");offers.add("Orange");
			i=0;
		}
		return offers;
	}
	
	
}
