package com.qa.main;

public class Car extends Vehicle {

	public boolean hasFourWheelDrive;

	public Car(int noOfWheels, int cost, String fuelType, Boolean fourWheelDrive) {
		super(noOfWheels, cost, fuelType);
		this.hasFourWheelDrive = fourWheelDrive;
		// TODO Auto-generated constructor stub
	}

	public boolean isHasFourWheelDrive() {
		return hasFourWheelDrive;
	}

	public void setHasFourWheelDrive(boolean hasFourWheelDrive) {
		this.hasFourWheelDrive = hasFourWheelDrive;
	}

	@Override
	public String toString() {
		return "Car [hasFourWheelDrive= " + hasFourWheelDrive + "," + super.toString();
	}

}
