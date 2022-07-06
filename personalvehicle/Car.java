package personalvehicle;

public class Car {
	int seatCapacity;
	private int speed;
	protected String model;
	public Car(int seatCapacity,int speed,String model)
	{
		this.seatCapacity=seatCapacity;
		this.speed=speed;
		this.model=model;
		
	}
	public int getSeatCapacity()
	{
		return seatCapacity;
	}
	
	public static void main(String args[])
	{
		Bike bike=new Bike("Black",80,1992);
		bike.showDetails();
		
	}

}
