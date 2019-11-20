package edu.sbme.oop.parking;

public class Vehicle {

	private final VehicleSize size;
	
	public Vehicle(VehicleSize s) {
		this.size = s;
	}
	
	public VehicleSize getSize() {
		return size;
	}
}
