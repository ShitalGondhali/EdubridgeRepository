package inheritancepackage;

public class Spaceship extends FlyingVehicle {

	boolean hyperdrive;
	
	
	public Spaceship(boolean hyperdrive) {
		super();
		this.hyperdrive = hyperdrive;
	}

	@Overriden
	public void fly()
	{
		System.out.println("This method is implemented in Child Class which names is Spaceship");
	}
	
	@Overriden
	public void land()
	{
		System.out.println("This method is implemented in Child Class which names is Spaceship");
	}

	@Override
	public String toString() {
		return "Spaceship [hyperdrive=" + hyperdrive + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
