package com.Basic.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Basic.Entities.Stock;
import com.Basic.Repositories.StockRepository;
import com.Basic.dto.StockRequest;
import com.Basic.dto.StockResponse;

@Service
public class StockService {
	private final StockRepository repo;

	public StockService(StockRepository repo) {
	
		this.repo = repo;
	}



	



	public StockResponse addStock(StockRequest request) {
		Stock  stock = new Stock();
		stock.setProductName(request.getProductName());
		stock.setPrice(request.getPrice());
		stock.setProductStock(request.getProductStock());
		
		Stock savedstock = repo.save(stock);
		 StockResponse response = new StockResponse();
		 response.setProductId(savedstock.getProductId());
		 response.setProductName(savedstock.getProductName());
		 response.setPrice(savedstock.getPrice());
		 response.setProductStock(savedstock.getProductStock());
		 
		 return response;
		
	}







	public List<StockResponse> viewStock() {
		List<Stock> stock = repo.findAll();
		List<StockResponse> responseList = new ArrayList<>();
		for(Stock item: stock) {
			StockResponse response = new StockResponse();
			response.setProductId(item.getProductId());
			response.setProductName(item.getProductName());
			response.setPrice(item.getPrice());
			response.setProductStock(item.getProductStock());
			
			responseList.add(response);
		}
		return responseList;
	}




	
}
