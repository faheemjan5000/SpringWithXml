package com.maven.Telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{  

	//every car needs Tyre ,so we define object tyre here; but car is annotation based config while tyre is xml based config.
	//lets use both config in this example.
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("car  " + this.getTyre());
	}

	
}
