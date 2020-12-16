package com.order;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.order.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;
	
	@Before
	public void before() {

	}
	
	@Test
	public void getCost() {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple"); fruits.add("Apple");fruits.add("Orange");fruits.add("Apple");
		Double cost = orderService.getCost(fruits);
		assertTrue(cost.equals(2.05));
	}
	
	@Test
	public void getOffer() {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple"); fruits.add("Orange");fruits.add("Orange");
		fruits = orderService.getOffer(fruits);
		assertTrue(fruits.size()==5);
	}
}
