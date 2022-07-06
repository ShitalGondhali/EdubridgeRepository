package anonymousclass;

public class FirstExample 
{
	public static void main(String [] args)
	{
		AnonymousInterface anonymousInterface =new AnonymousInterface() 
		{
			@Override
			public void print() 
			{
				System.out.println("Myself Anonymous");
			}
			
			
			@Override
			public void add(int num1, int num2) 
			{
				System.out.println(num1=num1+num2);
				
			}
		};
		anonymousInterface.print();
		anonymousInterface.add(10,10);
		System.out.println(anonymousInterface);
	}
}
