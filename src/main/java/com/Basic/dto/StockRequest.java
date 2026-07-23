package com.Basic.dto;

import java.math.BigDecimal;

public class StockRequest {
	private String  productName;
	private BigDecimal price;
	private Integer productStock;
	public StockRequest() {
	}
	public StockRequest(String productName, BigDecimal price, Integer productStock) {
		this.productName = productName;
		this.price = price;
		this.productStock = productStock;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getProductStock() {
		return productStock;
	}
	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}
}
