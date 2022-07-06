package nightpractice;

public class StaticInner 
{
	String name="Shital";
	String surName="Gondhali";
	public static class Inner
	{
		public void display()
		{
		System.out.println(new StaticInner().name);
	
		}
		
		public void diaplayAppend()
		{
			System.out.println(new StaticInner().name+" "+new StaticInner().surName);
		}
	}	
	
	
	public static void main(String[] args) 
	{
		Inner inner=new Inner();
		inner.display();
		inner.diaplayAppend();
	}

}
