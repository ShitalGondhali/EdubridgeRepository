package innerclassexample;

//Example of Local Inner Class
public class LocalInnerClassEx1 
{
	String name="Shital Gondhali";
		public void showName()
		{
			 class LocalClass
			{
				public void display()
				{
					System.out.println("I am the method of Local Inner Class");
				}
			}
			LocalClass localClass;
			new LocalClass().display();
		}
		public void displayName()
		{
			System.out.println("My name is "+name);
			
		}
		public static void main(String [] args)
		{
			LocalInnerClassEx1 localInnerClassEx1=new LocalInnerClassEx1();
			localInnerClassEx1.showName();
			//LocalInnerClassEx1.LocalClass localclass=new LocalInnerClassEx1(). new LocalClass();
			
		//LocalClass localclass=new(LocalClass)localInnerClassEx1;
			
			
			localInnerClassEx1.displayName(); 
			
		}
}
