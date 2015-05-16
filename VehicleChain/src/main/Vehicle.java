package main;

public abstract class Vehicle implements VehicleInterface {
	private String name;
	private String color;
	private int weight;
	private Person owner;
	
	public void transferOwnership(Person newOwner) {
		this.owner = newOwner;
	}
}
