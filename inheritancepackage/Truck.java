package inheritancepackage;

public class Truck extends GroundVehicle{
	
	double capacity;
	
	
	
	public Truck(double capacity) {
		super();
		this.capacity = capacity;
	}

	public void drive()
	{
		System.out.println("This method is implemented in Child Class which names is Truck");
	}
	
	public void loadCargo()
	{
		System.out.println("This method is implemented in Child Class which names is Truck");
	}

	@Override
	public String toString() {
		return "Truck [capacity=" + capacity + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
