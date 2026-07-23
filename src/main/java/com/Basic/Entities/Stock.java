package com.Basic.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@Column
	private String productName;
	@Column
	private BigDecimal price;
	@Column
	private Integer productStock;
	public Stock(Integer productId, String productName, BigDecimal price, Integer productStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productStock = productStock;
	}
	public Stock(String productName, BigDecimal price, Integer productStock) {
		super();
		this.productName = productName;
		this.price = price;
		this.productStock = productStock;
	}
	public Stock() {
		super();
	}
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
	
}
