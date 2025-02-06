package com.spring.practice.springproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	//feild injection
	//@Autowired
	private Enginee enginee;
	
	//Constructor Injection
	@Autowired
	public Car(Enginee enginee) {
		super();
		this.enginee = enginee;
	}



	public Enginee getEnginee() {
		return enginee;
	}
	
//	Setter Injection
//	@Autowired
//	public void setEnginee(Enginee enginee) {
//		this.enginee = enginee;
//	}

	

}
