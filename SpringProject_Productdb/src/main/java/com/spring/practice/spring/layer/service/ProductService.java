package com.spring.practice.spring.layer.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.practice.spring.layer.entity.Product;
import com.spring.practice.spring.layer.repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	Scanner input = new Scanner(System.in);

	public void addProduct() {
		Product product = new Product();

		System.out.println("Enter the product Id : ");
		product.setProductId(input.nextInt());


		System.out.println("Enter the product Name : ");
		product.setProductName(input.next());

		System.out.println("Enter the product Brand : ");
		product.setProductBrand(input.next());

		System.out.println("Enter the product Price : ");
		product.setProductPrice(input.nextInt());



		productRepository.addProduct(product);

		System.out.println("Data Entered Sucessfully");

	}

	public void findProduct() {

		System.out.println("Enter the product Id : ");

		Product p = productRepository.findProduct(input.nextInt());

		System.out.println(p);


	}

	public void deleteProduct() {
		System.out.println("Enter the product Id : ");

		productRepository.deleteProduct(input.nextInt());

	}

	public void updateProduct() {
		
		System.out.println("Enter the product Id : ");

		Product product = productRepository.findProduct(input.nextInt());
		
		System.out.println("Enter the product Name : ");
		product.setProductName(input.next());

		System.out.println("Enter the product Brand : ");
		product.setProductBrand(input.next());

		System.out.println("Enter the product Price : ");
		product.setProductPrice(input.nextInt());
		
		productRepository.updateProduct(product);


	}

	public void findAllProduct() {
		List<Product> product = productRepository.findAllProduct();
		
		for(Product products : product) {
			System.out.println(products);
		}
		
	}

}
