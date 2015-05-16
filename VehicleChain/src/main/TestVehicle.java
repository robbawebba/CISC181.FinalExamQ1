package main;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {

	public static void main(String[] args) {
		Person a = new Person();
		
		Car car = new Car(4);
		car.transferOwnership(a); // assigns original ownership to person a
		
		Truck truck = new Truck(2);
		truck.transferOwnership(a); // assigns original ownership to person a
		
		Person b = new Person();
		// transfers ownership of the above truck
		// from person a to person b
		truck.transferOwnership(b); 
		
		MotorCycle silverBlackPhantomBike = new MotorCycle(false);
		
		HashMap<UUID, Vehicle> hashmap = new HashMap<UUID, Vehicle>();
		hashmap.put(a.getPersonID(), car);
		hashmap.put(b.getPersonID(), truck);
		
	}

}
