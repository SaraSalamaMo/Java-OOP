package edu.sbme.oop.parking;

public class ParkingSpot {

	private final VehicleSize spotType;
	private final String spotId;
	private boolean available;
	
	public ParkingSpot(VehicleSize sType, String spotId) {
		this.spotType = sType;
		this.spotId = spotId;
		available = true;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void occupy() {
		this.available = false;
	}
	
	public void release() {
		this.available = true;
	}
	
	public String getSpotId() {
		return spotId;
	}
	
	public VehicleSize getSpotType() {
		return spotType;
	}
	
}
