package com.qa.main;

public class Motorbike extends Vehicle {

	public boolean isASuperBike;

	public Motorbike(int noOfWheels, int cost, String fuelType, boolean superBike) {
		super(noOfWheels, cost, fuelType);
		this.isASuperBike = superBike;
	}

	public boolean isASuperBike() {
		return isASuperBike;
	}

	public void setASuperBike(boolean isASuperBike) {
		this.isASuperBike = isASuperBike;
	}

	@Override
	public String toString() {
		return "Motorbike [isASuperBike= " + isASuperBike + "," + super.toString();
	}

}
