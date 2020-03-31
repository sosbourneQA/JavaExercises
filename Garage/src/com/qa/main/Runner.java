package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage garage = new Garage();

		garage.addVehicle(new Car(4, 20000, "pterol", true));
		garage.addVehicle(new Motorbike(2, 10000, "diesel", false));
		garage.addVehicle(new Lorry(8, 30000, "hydrogen", true));
		garage.addVehicle(new Car(3, 35000, "wine", false));

		System.out.println("Your bill is: £" + garage.billCalculator());

		garage.showList();

	}

}
