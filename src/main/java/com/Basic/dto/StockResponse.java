package com.Basic.dto;

import java.math.BigDecimal;

public class StockResponse {
	private Integer productId;
	private String productName;
	private BigDecimal price;
	private Integer productStock;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
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
	public StockResponse() {
	}
	public StockResponse(Integer productId, String productName, BigDecimal price, Integer productStock) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productStock = productStock;
	}
	
}
