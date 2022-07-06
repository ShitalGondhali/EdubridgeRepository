package polymorphism;

import java.util.Scanner;

public class StaticPolymorphism {//method overloading

	
	float f1=0;
	float f2=0;
	int number1,number2;
	
	public StaticPolymorphism(float f1, float f2, int number1, int number2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.number1 = number1;
		this.number2 = number2;
	}


	public void add(float f1,float f2)//2.2 3.5
	{
		System.out.println(f1+f2+this.f1+this.f2);//5.7
		
	}
	

	public void add(float f1,int number1)//2.2 12
	{
		System.out.println(f1+number1);//14.2
	}
	
	public void add(int number1,float f2)//12 3.5
	{
		System.out.println(number1+f2);//15.5
	}
	public void add(int number1,int number2)//12 13
	{
		System.out.println(number1+number2);//25
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		StaticPolymorphism staticPolymorphism=new StaticPolymorphism(scanner.nextFloat(),scanner.nextFloat(),scanner.nextInt(),scanner.nextInt());
		
		
		/*System.out.println("Enter the first float number:");
		staticPolymorphism.f1=scanner.nextFloat();
		
		System.out.println("Enter the second float number:");
		staticPolymorphism.f2=scanner.nextFloat();
		
		System.out.println("Enter the first integer number:");
		staticPolymorphism.number1=scanner.nextInt();
		
		System.out.println("Enter the second integer number:");
		staticPolymorphism.number2=scanner.nextInt();*/
		
		
		staticPolymorphism.add(10,20);
		staticPolymorphism.add(1.2f,12);
		staticPolymorphism.add(13,2.5f);
		staticPolymorphism.add(4.5f,8.6f);
	}

}
