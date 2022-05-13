package com.qa.main.garage;

import java.util.ArrayList;

public class Garage implements fixVehicle{
	
	public static void garageArray() {
		
		ArrayList<String> carModelList = new ArrayList<>();
		ArrayList<String> bikeModelList = new ArrayList<>();
		ArrayList<String> vanModelList = new ArrayList<>();
		
		
		//car.add
		carModelList.add("Toyota");
		carModelList.add("Ferrari");
		carModelList.add("Jaguar");
		carModelList.add("Land Rover");
		//bike.add
		bikeModelList.add("Yamaha");
		bikeModelList.add("Bianchi");
		bikeModelList.add("Kawasaki");
		bikeModelList.add("Harley Davidson");
		//van.add
		vanModelList.add("Mercedes");
		vanModelList.add("Renault");
		vanModelList.add("Ford");
		vanModelList.add("Vauxhall");
		
	}

	@Override
	public String intFixVehicle(float fixCost) {
		// TODO Auto-generated method stub
		return null;
	}

}
