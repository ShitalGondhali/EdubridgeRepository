package inheritancepackage;

public class Airplane extends FlyingVehicle {

	int passengers;
	
	
	public Airplane(int passengers) {
		super();
		this.passengers = passengers;
	}

	@Overriden
	public void fly()
	{
		System.out.println("This method is implemented in Child Class which names is Airplane");
	}
	
	@Overriden
	public void land()
	{
		System.out.println("This method is implemented in Child Class which names is Airplane");
		
	}

	@Override
	public String toString() {
		return "Airplane [passengers=" + passengers + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
