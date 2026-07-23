package com.Basic.Services;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.Basic.Entities.Stock;
import com.Basic.Entities.User;
import com.Basic.Entities.order;
import com.Basic.Repositories.OrderRepository;
import com.Basic.Repositories.StockRepository;
import com.Basic.Repositories.UserRepository;
import com.Basic.dto.OrderRequest;
import com.Basic.dto.OrderResponse;


@Service
public class OrderService {
	private final OrderRepository orderRepo;
	private final UserRepository userRepo;
	private final StockRepository stockRepo;
	
	
	public OrderService(OrderRepository orderRepo, UserRepository userRepo, StockRepository stockRepo) {
		this.orderRepo = orderRepo;
		this.userRepo = userRepo;
		this.stockRepo = stockRepo;
		
	}





	public OrderResponse placeOrder(OrderRequest request) {

	    User user = userRepo.findById(request.getUserId())
	            .orElseThrow(() -> new RuntimeException("User not found"));

	    Stock product = stockRepo.findById(request.getProductId())
	            .orElseThrow(() -> new RuntimeException("Product not found"));

	    if (product.getProductStock() < request.getQuantity()) {
	        throw new RuntimeException("Insufficient quantity");
	    }

	    product.setProductStock(product.getProductStock() - request.getQuantity());
	    stockRepo.save(product);

	    order orders = new order();

	    orders.setUser(user);
	    orders.setProduct(product);
	    orders.setQuantity(request.getQuantity());

	    BigDecimal totalPrice =
	            product.getPrice().multiply(BigDecimal.valueOf(request.getQuantity()));

	    orders.setTotalPrice(totalPrice);

	    order savedOrder = orderRepo.save(orders);

	    OrderResponse response = new OrderResponse();

	    response.setOrderId(savedOrder.getId());
	    response.setUserName(savedOrder.getUser().getUserName());
	    response.setProductName(savedOrder.getProduct().getProductName());
	    response.setPrice(savedOrder.getProduct().getPrice());
	    response.setQuantity(savedOrder.getQuantity());
	    response.setTotalPrice(savedOrder.getTotalPrice());

	    return response;
	}





	public List<OrderResponse> view(Integer userId) {
		List<order> orders = orderRepo.findByUser_userId(userId);
		List<OrderResponse> responseList = new ArrayList<>();
		for(order list : orders) {
			
			OrderResponse response = new OrderResponse();
			
			response.setOrderId(list.getId());
			response.setUserName(list.getUser().getUserName());
			response.setProductName(list.getProduct().getProductName());
			response.setPrice(list.getProduct().getPrice());
			response.setQuantity(list.getQuantity());
			response.setTotalPrice(list.getTotalPrice());
			
			responseList.add(response);
			
		}
		return responseList;
	}
	
}
