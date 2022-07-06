package nightpractice;

public class LocalInner 
{
	public void showClass()
	{
		 class Local
		{
			public void display()
			{
				System.out.println("Welcome to Local class which is Local Inner Class");
			}
		}
		 Local local;
		 local=new Local();
		 local.display();
		 
	}
	public static void main(String[] args) 
	{
		LocalInner localinner=new LocalInner();
		localinner.showClass();
		

	}

}
