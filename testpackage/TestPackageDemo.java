package testpackage;

import cargovehicles.Ship;
import cargovehicles.Truck;
import personalvehicle.Bike;
import personalvehicle.Car;


public class TestPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CALLING SHIP CLASS METHOD
		Ship ship=new Ship(8000);
		System.out.println(ship.getWeight());
		
		//CALLING TRUCK CLASS METHOD
		Truck truck=new Truck(100);
		System.out.println(truck.getCargoCapacity());
		
		//CALLING BIKE CLASS METHODS
		Bike bike=new Bike("Black",80,1960);
		bike.showDetails();
		
		//CALLING CAR CLASS METHOD
		Car car=new Car(5,80,"Suzuki");
		System.out.println(car.getSeatCapacity());
	}

}
