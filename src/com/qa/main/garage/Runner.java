package com.qa.main.garage;

public class Runner {

	public static void main(String[] args) {
		
		//car.object
		Car toyotaCar = new Car("Blue", 4, true, 22500f, 4, true, "Toyota", false);
		Car ferrariCar = new Car("Red", 4, true, 149999.99f, 2, false, "Ferrari", false);
		Car jaguarCar = new Car("Black", 4, true, 99950.50f, 5, false, "Jaguar", true);
		Car landRoverCar = new Car("Green", 5, true, 80000f, 5, false, "Land Rover", false);
		
		//bike.object
		Bike yamahaBike = new Bike("Yellow", 2, true, 10749.99f, false, "Yamaha", 999);
		Bike bianchiBike = new Bike("Purple", 2, false, 799.99f, true, "Bianchi", 0);
		Bike kawasakiBike = new Bike("White", 2, true, 12500f, false, "Kawasaki", 250);
		Bike harleyDavidsonBike = new Bike("Black", 3, true, 18500.49f, false, "Harley Davidson", 3);
		
		//van.object
		Van mercedesVan = new Van("Grey", 4, true, 25450.99f, "Medium", false, 25);
		Van renaultVan = new Van("White", 3, false, 200, "Small", false, 4000);
		Van fordVan = new Van("Blue", 4, true, 59999.99f, "Big", true, 500);
		Van vauxhall = new Van("White", 6, true, 99999.99f, "Very Big", true, 136);
		
		
	}

}
