package inheritancepackage;

public class Car extends GroundVehicle {
	
	String noPlates;
	
	
	public Car(String noPlates) {
		super();
		this.noPlates = noPlates;
	}

	public void drive()
	{
		System.out.println("This method is implemented in Child Class which names is Car");
	}
	
	public void ponderEthicalDilemma()
	{
		System.out.println("This method is implemented in Child Class which names is Car");
	}

	@Override
	public String toString() {
		return "Car [noPlates=" + noPlates + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
