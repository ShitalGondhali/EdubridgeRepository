package personalvehicle;

public class Bike
{
	public String color;
	private int speed;
	int year;
	public Bike(String color,int speed,int year)
	{
		this.color=color;
		this.speed=speed;
		this.year=year;
	}
	public void showDetails()
	{
		System.out.println(color+" "+speed+" "+year+" ");
	}
	public static void main(String args[])
	{
	Car car=new Car(5,80,"Xylo");
	System.out.println(car.getSeatCapacity());
	}
}


