package com.maven.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	
	public void drive() {
		System.out.println("Bag raha hai....");
	}
}
