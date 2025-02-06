package com.spring.practice.spring.layer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	int productId;
	String ProductName;
	String productBrand;
	int ProductPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", productBrand=" + productBrand
				+ ", ProductPrice=" + ProductPrice + "]";
	}


}
