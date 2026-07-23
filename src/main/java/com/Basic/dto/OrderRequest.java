package com.Basic.dto;

public class OrderRequest {
	private Integer userId;
	private Integer productId;
	private Integer quantity;
	public OrderRequest(Integer userId, Integer productId, Integer quantity) {
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
	}
	public OrderRequest() {
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
