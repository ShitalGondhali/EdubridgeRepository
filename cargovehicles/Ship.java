package cargovehicles;
import personalvehicle.*;
public class Ship {
	public int weight;
	
	public Ship(int weight)
	{
		super();
		this.weight=weight;
	}
	
	public int getWeight() {
		return weight;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck=new Truck(100);
		System.out.println(truck.getCargoCapacity());
		Car car=new Car(5,70,"Suzuki");
		System.out.println(car.getSeatCapacity());
	}

}
