package com.learnershub;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public static void main(String[] args) {
		Car porsche = new Car();
		Car Toyota = new Car();

		// System.out.println("Model is " + porsche.getModel());
		porsche.setModel("Cayenne");
		System.out.println("Model is " + porsche.getModel());

	}

}
