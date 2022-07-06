package inheritancepackage;

import java.util.Scanner;

public class TestFlyingVehicles {
	
	public static FlyingVehicle createObject(String str)
	{
		if(str.equals("Spaceship"))
		{
			return new Spaceship(false);
		}else if(str.equals("Airplane"))
		{
			return new Airplane(50);
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the object you wants to create:");
		FlyingVehicle flyingVehicle=createObject(new Scanner(System.in).next());
		
		
		//flyingVehicle=new Spaceship(false);
		flyingVehicle.fly();
		flyingVehicle.land();
		System.out.println(flyingVehicle);
		
		//flyingVehicle=new Airplane(50);
		//flyingVehicle.fly();
		//flyingVehicle.land();
		//System.out.println(flyingVehicle);
		

	}

}
