package inheritancepackage;

public class FlyingVehicle {

	 void fly()
	{
		System.out.println("Implemented in Child class");
		
	}
	
	 void land()
	{
		System.out.println("Implemented in Child class");
	}

	@Override
	public String toString() {
		return "FlyingVehicle []";
	}
	
}
