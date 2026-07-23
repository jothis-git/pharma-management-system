package com.Basic.Controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Basic.Entities.order;
import com.Basic.Services.OrderService;
import com.Basic.dto.OrderRequest;
import com.Basic.dto.OrderResponse;

@RestController
@RequestMapping("/order")
public class OrderController {
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	@PostMapping("/placeOrder")
	public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest request) {
		
		return ResponseEntity.ok(orderService.placeOrder(request));
	}
	@GetMapping("/viewOrder/{userId}")
	public ResponseEntity<List<OrderResponse>> orders(@PathVariable Integer userId) {
		List<OrderResponse> orders = orderService.view(userId); 
		return ResponseEntity.ok(orders);
	}
	
}

