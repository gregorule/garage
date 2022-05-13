package com.qa.main.garage;

public abstract class Vehicle {
	
	//Fields
	private String colour;
	private int wheels;
	private boolean engine;
	private float value;
	
	//Constructors
	public Vehicle(String colour, int wheels, boolean engine, float value) {
		super();
		this.colour = colour;
		this.wheels = wheels;
		this.engine = engine;
		this.value = value;
	}
	
	//Methods
	public abstract String mphMax(int mph);
	
	public abstract String passengers(int people);

	
	//Getters and Setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
	
	
	
	

}
