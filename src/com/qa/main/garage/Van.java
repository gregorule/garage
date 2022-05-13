package com.qa.main.garage;

public class Van extends Vehicle implements fixVehicle{
	
	//Fields
	private String size;
	private boolean hireOut;
	private int jobsDone;
	
	//Methods
	public String work() {
		return "I use this van for work";
	}

	//Constructors
	public Van(String colour, int wheels, boolean engine, float value, String size, boolean hireOut, int jobsDone) {
		super(colour, wheels, engine, value);
		this.size = size;
		this.hireOut = hireOut;
		this.jobsDone = jobsDone;
	}

	//Getters and Setters
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isHireOut() {
		return hireOut;
	}

	public void setHireOut(boolean hireOut) {
		this.hireOut = hireOut;
	}

	public int getJobsDone() {
		return jobsDone;
	}

	public void setJobsDone(int jobsDone) {
		this.jobsDone = jobsDone;
	}

	@Override
	public String mphMax(int mph) {
		return "The max MPH of my fastest van is " + mph;
	}

	@Override
	public String passengers(int people) {
		return "The max number of passengers in my biggest van is " + people;
	}

	@Override
	public String intFixVehicle(float fixCost) {
		fixCost = 1500;
		if(size == "Big" || size == "Very Big") {
			fixCost *= 2;
		}else if(hireOut == true) {
			fixCost += 100;
		}else if(jobsDone > 500) {
			fixCost /= 2;
		}
		return "The total price to fix this van will be £" + fixCost;
	}
	
	
	
	
	

}
