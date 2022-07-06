package innerclassexample;

public class StaticNestedClass {

	int number=2000;
	static class Inner
	{
		public void testInner()
		{
			System.out.println(new StaticNestedClass().number);
		}
		
	}
	
	public static void main(String [] args)
	{
		//StaticNestedClass staticNestedClass=new StaticNestedClass();
		Inner inner;
		new Inner().testInner();
	}
}
