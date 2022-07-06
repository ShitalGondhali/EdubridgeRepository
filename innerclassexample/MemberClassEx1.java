package innerclassexample;

///Example of Member InnerClass
public class MemberClassEx1 {

	public class Example
	{
		public void display()
		{
			System.out.print("We are having example of Member Inner Class,Let's test that function");
		}
	}
	public static void main(String [] args)
	{
		MemberClassEx1.Example example=new MemberClassEx1().new Example();
		
		example.display();
		
	}
}
