package innerclassexample;

//Example of Member Inner Class
public class Car 
{
	public class Engine
	{
		public void start()
		{
			System.out.println("Engine Started successfully");
		}
	}
	
	public void start()
	{
		
		Engine engine=new Engine();
		engine.start();
	}
	
	
	public static void main(String [] args)
	{
		Car car;
		car=new Car();
		car.start();
	}
}
