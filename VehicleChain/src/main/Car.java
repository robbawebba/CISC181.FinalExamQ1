package main;

public class Car extends Vehicle implements VehicleInterface{
	private int numberOfDoors;

	public Car(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
