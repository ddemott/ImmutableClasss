package com.demott.immutableclass;

// A simple example of an immutable object.  Once the object 
// is created, none of the attributes can be changed

public final class Car {

	public final String model;
	public final String make;
	public final Integer year;

	public Car(String model, String make, Integer year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}

}
