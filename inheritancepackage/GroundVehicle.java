package inheritancepackage;

public class GroundVehicle {
	
	void drive()
	{
		
	}

	@Override
	public String toString() {
		return "GroundVehicle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

