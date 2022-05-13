package com.qa.main.garage;

public class Bike extends Vehicle implements fixVehicle{
	
	//Fields
	private boolean pedalBike;
	private String model;
	private int stickers;
	
	//Methods
	public String wheelie() {
		return "I can pop a wheelie in this!";
	}
	
	public String sideCarAttachment() {
		return "I can add a sidecar to this bike!";
	}

	//Constructors
	public Bike(String colour, int wheels, boolean engine, float value, boolean pedalBike, String model, int stickers) {
		super(colour, wheels, engine, value);
		this.pedalBike = pedalBike;
		this.model = model;
		this.stickers = stickers;
	}

	//Getters and Setters
	public boolean isPedalBike() {
		return pedalBike;
	}

	public void setPedalBike(boolean pedalBike) {
		this.pedalBike = pedalBike;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStickers() {
		return stickers;
	}

	public void setStickers(int stickers) {
		this.stickers = stickers;
	}

	@Override
	public String mphMax(int mph) {
		return "The max MPH of my fastest bike is " + mph;
	}

	@Override
	public String passengers(int people) {
		return "The max number of passengers on a bike is " + people;
	}


	@Override
	public String intFixVehicle(float fixCost) {
		fixCost = 250;
		if(pedalBike == true) {
			fixCost /= 2;
		}else if(stickers >= 10) {
			fixCost += 100;
		}else if(model == "Harley Davidson") {
			fixCost += 1250;
		}
		return "The total price to fix this bike will be £" + fixCost;
	}
	
	
	
	
	
	

}
