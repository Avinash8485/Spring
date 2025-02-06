package com.spring.practice.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.practice.demo.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac =  new AnnotationConfigApplicationContext(AppConfiguration.class);
    	Product p = ac.getBean(Product.class);
    	System.out.println(p);
    	
    	Product p1 =(Product) ac.getBean("product");
    	System.out.println(p1);
    	
    	
    	ApplicationContext ac1 =  new ClassPathXmlApplicationContext("spring.xml");
    	Product p2 = ac.getBean(Product.class);
    	System.out.println(p2);
    	
    	Product p3 =(Product) ac.getBean("product");
    	System.out.println(p3);
    	
    	Employee e = ac.getBean(Employee.class);
    	System.out.println(e);
    }
}
