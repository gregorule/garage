package com.qa.main.garage;

public class Car extends Vehicle implements fixVehicle{
	
	//Fields
	private int doors;
	private boolean electric;
	private String model;
	private boolean vintage; 
	
	//Methods
	public String commute() {
		return "I can travel to work in my car";
	}

	//Constructors
	public Car(String colour, int wheels, boolean engine, float value, int doors, boolean electric, String model,
			boolean vintage) {
		super(colour, wheels, engine, value);
		this.doors = doors;
		this.electric = electric;
		this.model = model;
		this.vintage = vintage;
	}

	//Getters and Setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isVintage() {
		return vintage;
	}

	public void setVintage(boolean vintage) {
		this.vintage = vintage;
	}


	@Override
	public String mphMax(int mph) {
		return "The max MPH of my fastest car is " + mph;
	}

	@Override
	public String passengers(int people) {
		return "The max number of passengers in my biggest car is " + people;
	}


	@Override
	public String intFixVehicle(float fixCost) {
		fixCost = 1000;
		if(electric == true) {
			fixCost += 1000;
			return "It is £1000 more to fix electric cars.";
		}else if(doors > 2) {
			fixCost += 500;
			return "It is £500 more to fix cars with more than 2 doors.";
		}else if(vintage == true) {
			fixCost *= 2;
			return "Vintage cars double the price!";	
		}else if(model == "Ferrari" || model == "Lamborghini") {
			fixCost += 200;
			return "Sports cars are £200 more.";
		}else
		return null;
	}


	
	
	
	

}
