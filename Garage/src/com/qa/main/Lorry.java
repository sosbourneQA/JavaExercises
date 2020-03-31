package com.qa.main;

public class Lorry extends Vehicle {

	public boolean isAHeavyGoodsVehicle;

	public Lorry(int noOfWheels, int cost, String fuelType, boolean heavyGoods) {
		super(noOfWheels, cost, fuelType);
		// TODO Auto-generated constructor stub
		this.isAHeavyGoodsVehicle = heavyGoods;
	}

	public boolean isAHeavyGoodsVehicle() {
		return isAHeavyGoodsVehicle;
	}

	public void setAHeavyGoodsVehicle(boolean isAHeavyGoodsVehicle) {
		this.isAHeavyGoodsVehicle = isAHeavyGoodsVehicle;
	}

	@Override
	public String toString() {
		return "Lorry [isAHeavyGoodsVehicle= " + isAHeavyGoodsVehicle + "," + super.toString();
	}
}
