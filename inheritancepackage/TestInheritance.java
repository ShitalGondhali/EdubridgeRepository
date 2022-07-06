package inheritancepackage;

public class TestInheritance {

	public static void main(String [] args)
	{
	Child child=new Child("Shital");
	System.out.println(child.getClass());
	
	child.displayMessage();
	
	}
}
