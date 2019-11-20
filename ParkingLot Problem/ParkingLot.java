package edu.sbme.oop.parking;

import java.util.ArrayList;
import java.util.Date;

/**
 * Imagine you need to design a parking lot. The lot has multiple parking spots, each parking spot can 
 * fit compact (Toyota yaris) or regular(Toyota corola) car. When a car is parked, a ticket is issued 
 * that indicates the start time. No ticket is issued if the parking lot is full.
 * A compact car can be parked in regular spot if all compact spots are occupied, the opposite is not valid.
 * @author mahmoudmahmoud
 *
 */
public class ParkingLot {

	private ArrayList<ParkingSpot> freeCompactSpots;
	private ArrayList<ParkingSpot> usedCompactSpots; 
	private ArrayList<ParkingSpot> freeRegularSpots;
	private ArrayList<ParkingSpot> usedRegularSpots;
	
	public ParkingLot(int noOfCompactSpots, int noOfRegularSpots) {
		freeCompactSpots = new ArrayList<ParkingSpot>(noOfCompactSpots);
		usedCompactSpots = new ArrayList<ParkingSpot>(noOfCompactSpots);
		
		freeRegularSpots = new ArrayList<ParkingSpot>(noOfRegularSpots);
		usedRegularSpots = new ArrayList<ParkingSpot>(noOfRegularSpots);
		
		for(int i = 0; i < noOfCompactSpots; i++) {
			freeCompactSpots.add(new ParkingSpot(VehicleSize.COMPACT, "C" + (i+1) ));
		}
		
		for(int i = 0; i < noOfRegularSpots; i++) {
			freeRegularSpots.add(new ParkingSpot(VehicleSize.REGULAR, "R" + (i+1) ));
		}
	}
	
	public boolean isFull() {
		return freeCompactSpots.isEmpty() && freeRegularSpots.isEmpty();
	}
	
	public void releaseTicket(Ticket t) {
		if(t.getSpot().getSpotType() == VehicleSize.REGULAR) {
			releaseRegularCar(t);
		} else {
			releastCompactTicket(t);
		}
	}
	
	private void releastCompactTicket(Ticket t) {
		for(int i = 0; i< usedCompactSpots.size(); i++) {
			if(usedCompactSpots.get(i) == t.getSpot()) {
				t.getSpot().release();
				freeCompactSpots.add(t.getSpot());
				usedCompactSpots.remove(i);
			}
		}	
	}

	private void releaseRegularCar(Ticket t) {
		for(int i = 0; i< usedRegularSpots.size(); i++) {
			if(usedRegularSpots.get(i) == t.getSpot()) {
				t.getSpot().release();
				freeRegularSpots.add(t.getSpot());
				usedRegularSpots.remove(i);
			}
		}
	}
	
	public Ticket parkVehicle(Vehicle vehicle) {
		ParkingSpot spot = getBestCandidateSpot(vehicle);
		if(spot == null) {
			return null;
		} else {
			return new Ticket(new Date(), spot);
		}
	}

	private ParkingSpot getBestCandidateSpot(Vehicle vehicle) {
		if(vehicle.getSize() == VehicleSize.REGULAR) {
			return getRegularSpot(vehicle);
		} else {
			ParkingSpot spot = getCompactSpot(vehicle);
			if(spot == null) {
				return getRegularSpot(vehicle);
			} 
			return spot;
		}
	}

	private ParkingSpot getCompactSpot(Vehicle vehicle) {
		if(freeCompactSpots.isEmpty()) {
			return null;
		} else {
			ParkingSpot freeSpot = freeCompactSpots.get(0);
			usedCompactSpots.add(freeSpot);
			freeCompactSpots.remove(0);
			freeSpot.occupy();
			return freeSpot;
		}
	}

	private ParkingSpot getRegularSpot(Vehicle vehicle) {
		if(freeRegularSpots.isEmpty()) {
			return null;
		} else {
			ParkingSpot freeSpot = freeRegularSpots.get(0);
			usedRegularSpots.add(freeSpot);
			freeRegularSpots.remove(0);
			freeSpot.occupy();
			return freeSpot;
		}
	}
	
}
