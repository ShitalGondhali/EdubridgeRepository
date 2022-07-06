package nightpractice;

import java.util.Scanner;

public class InterfaceAnonymousClass
{

	public static void main(String[] args)
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2=scanner.nextInt();
		
		InterfaceAnonymous interfaceAnonymous=new InterfaceAnonymous() 
		{

			@Override
			public void add()
			{
				System.out.println(num1+num2);
				
			}

			@Override
			public void sub() 
			{
				System.out.println(num1-num2);
				
			}

			@Override
			public void mul() 
			{
				System.out.println(num1*num2);
				
			}

			@Override
			public void div()
			{
				System.out.println(num1/num2);
				
			}
			
		};
		System.out.println(interfaceAnonymous);
		interfaceAnonymous.add();
		interfaceAnonymous.sub();
		interfaceAnonymous.mul();
		interfaceAnonymous.div();

	}

}
