package com.Basic.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Basic.Entities.Stock;
import com.Basic.Services.StockService;
import com.Basic.dto.StockRequest;
import com.Basic.dto.StockResponse;

@RestController
@RequestMapping("/")
public class StockController {
	private final StockService service;

	public StockController(StockService service) {
		this.service = service;
	}
	@PostMapping("/stock/addProducts")
	public ResponseEntity<StockResponse> addProducts(@RequestBody StockRequest request) {
		return ResponseEntity.ok(service.addStock(request));
	}
	@GetMapping("/stock/view")
	public ResponseEntity<List<StockResponse>> viewStock(){
		List<StockResponse> stock = service.viewStock();
		return ResponseEntity.ok(stock);
	}
}
