package polymorphism;

public class DynamicPoly extends DynamicPolymorphism{
	
	int id;
	String name;
	String address;
	
	public DynamicPoly(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public void displayDetails()
	{
		System.out.println("The id is:"+id+" The name is:"+name+" The address is: "+address);
	}
	public void sample()
	{
		System.out.println("Testing");
	}
}
