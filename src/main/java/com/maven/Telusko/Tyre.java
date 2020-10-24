package com.maven.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	
	//in spring these attributes are properties so set em in the xml file 
	private String brand;



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre....its working";
	}
	
}
