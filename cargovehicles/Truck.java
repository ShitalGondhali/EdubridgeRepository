package cargovehicles;

public class Truck {
	int cargoCapacity;
	
	
	public Truck(int cargoCapacity)
	{
		this.cargoCapacity=cargoCapacity;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship ship=new Ship(400);
		System.out.println(ship.getWeight());
	}

}
