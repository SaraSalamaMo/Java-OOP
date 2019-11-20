package edu.sbme.oop.parking;

public enum VehicleSize {

	COMPACT(1),
	REGULAR(2);
	
	private int value;
	
	private VehicleSize(int value) {
		this.value = value;
	}
		
}
