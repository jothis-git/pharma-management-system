package com.Basic.dto;

import java.math.BigDecimal;

public class OrderResponse {
	private Integer orderId;
	private String userName;
	private String productName;
	private Integer quantity;
	private BigDecimal price;
	private BigDecimal totalPrice;
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderResponse(Integer orderId, String userName, String productName, Integer quantity, BigDecimal price,
			BigDecimal totalPrice) {
		this.orderId = orderId;
		this.userName = userName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public OrderResponse() {
	}
}
	