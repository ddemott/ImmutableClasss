package com.demott.immutableclass;

public class Main {
	public static void main(String[] args) {

		Car car = new Car("Nissan", "Rogue", 2014);

		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);

		//
		// car.make = "Ford";
		// Any attempt to change to the attributes will render an error due to it being
		// final.
		//
		// Any attempt to extend the class will render and error due to the class being
		// final.
		//
	}

}
