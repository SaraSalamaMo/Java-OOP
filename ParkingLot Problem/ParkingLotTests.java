package edu.sbme.oop.parking.test;

import junit.framework.Assert;

import org.junit.Test;

import edu.sbme.oop.parking.ParkingLot;
import edu.sbme.oop.parking.Ticket;
import edu.sbme.oop.parking.Vehicle;
import edu.sbme.oop.parking.VehicleSize;

public class ParkingLotTests {

	  @Test
	  public void isFullTests() {
		  ParkingLot pLot = new ParkingLot(1, 1);
		  Assert.assertFalse(pLot.isFull());
		  Ticket t = pLot.parkVehicle(new Vehicle(VehicleSize.COMPACT));
		  pLot.parkVehicle(new Vehicle(VehicleSize.REGULAR));
		  Assert.assertTrue(pLot.isFull());
		  pLot.releaseTicket(t);
		  Assert.assertFalse(pLot.isFull());
	  }
	  
	  @Test
	  public void parkVehicleFullLog() {
		  ParkingLot pLot = new ParkingLot(1, 1);
		  pLot.parkVehicle(new Vehicle(VehicleSize.COMPACT));
		  pLot.parkVehicle(new Vehicle(VehicleSize.REGULAR));
		  Assert.assertTrue(pLot.isFull());
		  Assert.assertNull(pLot.parkVehicle(new Vehicle(VehicleSize.REGULAR)));
	  }
	  
	  @Test
	  public void cannotParkRegularInCompactSpotTest() {
		  ParkingLot pLot = new ParkingLot(1, 1);
		  pLot.parkVehicle(new Vehicle(VehicleSize.REGULAR));
		  Assert.assertNull(pLot.parkVehicle(new Vehicle(VehicleSize.REGULAR)));
	  }
	  
	  @Test
	  public void canParkCompactInRegularSpotTest() {
		  ParkingLot pLot = new ParkingLot(1, 1);
		  pLot.parkVehicle(new Vehicle(VehicleSize.COMPACT));
		  Assert.assertNotNull(pLot.parkVehicle(new Vehicle(VehicleSize.COMPACT)));
		  Assert.assertTrue(pLot.isFull());
	  }
}
