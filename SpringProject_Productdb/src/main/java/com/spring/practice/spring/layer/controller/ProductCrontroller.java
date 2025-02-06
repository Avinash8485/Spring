package com.spring.practice.spring.layer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.practice.spring.layer.service.ProductService;

@Controller
public class ProductCrontroller {

	@Autowired
	private ProductService productService;

	public void addProduct() {
		productService.addProduct();
	}

	public void findProduct() {
		productService.findProduct();
	}

	public void deleteProduct() {
		productService.deleteProduct();
	}

	public void updateProduct() {
		productService.updateProduct();		
	}
	
	public void findAllProduct() {
		productService.findAllProduct();		
	}

}
