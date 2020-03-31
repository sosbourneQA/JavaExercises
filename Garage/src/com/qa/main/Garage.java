package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicleList = new ArrayList<>();

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicleList.add(vehicle);
	}

	public int billCalculator() {
		int bill = 0;
		for (int v = 0; v < vehicleList.size(); v++) {
			if (vehicleList.get(v) instanceof Lorry) {
				bill += 1000;
			} else {
				bill += 0;
			}
		}
		return bill;
	}

	public void showList() {
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.println(vehicleList.get(i).toString());
		}
	}

}
