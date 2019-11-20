package edu.sbme.oop.parking;

import java.util.Date;

public class Ticket {
    private final Date entranceTime;
    private final ParkingSpot spot;
    
    public Ticket(Date date, ParkingSpot spot) {
    	this.entranceTime = date;
    	this.spot = spot;
    }

	public ParkingSpot getSpot() {
		return spot;
	}

	public Date getEntranceTime() {
		return entranceTime;
	}
    
}
