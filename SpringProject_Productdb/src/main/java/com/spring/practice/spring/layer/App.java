package com.spring.practice.spring.layer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.practice.spring.layer.controller.ProductCrontroller;

public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductCrontroller p = ap.getBean(ProductCrontroller.class);

		p.findAllProduct();


	}
}
