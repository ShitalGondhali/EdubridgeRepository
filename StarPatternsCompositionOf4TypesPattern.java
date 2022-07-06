
public class StarPatternsCompositionOf4TypesPattern {

	public void starPattern1()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public void starPattern2()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  "+i+"  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public void starPattern3()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public void starPattern4()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	public void starPattern5()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) 
	{
		StarPatternsCompositionOf4TypesPattern starPat=new StarPatternsCompositionOf4TypesPattern();
		
		

		starPat.starPattern1();
		starPat.starPattern2();
		starPat.starPattern3();
		starPat.starPattern4();
		starPat.starPattern5();
		
		
	}

}
