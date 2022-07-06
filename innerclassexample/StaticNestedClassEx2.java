package innerclassexample;

public class StaticNestedClassEx2 
{
	
	String name="Shital Gondhali";
	int batchCode=2022_7469;
	static class Static
	{
		public void displayDetails()
		{
			System.out.print("My name is ");
			System.out.println(new StaticNestedClassEx2().name);
			
			System.out.print("My batch code is ");
			System.out.println(new StaticNestedClassEx2().batchCode);
		}
	}
	public static void main(String[] args)
	{
		Static stati=new Static();
		stati.displayDetails();

	}

}
