package inheritancepackage;

public class TestGroundVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroundVehicle groundVehicle=new GroundVehicle();
		
		
		//groundVehicle=new Car();
		groundVehicle.drive();
		
		Truck truck=new Truck(20);
		truck.loadCargo();
		System.out.println(groundVehicle);
		
		//truck.toString();
		
	}

}
