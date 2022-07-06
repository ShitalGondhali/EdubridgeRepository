package conditionpackage;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration 
		int temperature;
		
		//taking value from user using scanner class
		System.out.print("Enter temperature:");
		Scanner scanner=new Scanner(System.in);
		temperature=scanner.nextInt();
		
		//Checking the condition to decide whether temp is hot,cold or warm
		if(temperature<0)
		{
			System.out.print("It's Freezing");
		}else if(temperature>0 || temperature<10)
		{
			System.out.print("Very cold");
		}else if(temperature>10 || temperature<20)
		{
			System.out.print("cold");
		}else if(temperature>20 || temperature<30)
		{
			System.out.print("warm");
		}else if(temperature>30 || temperature<35)
		{
			System.out.print("Hot");
		}else
			System.out.print("Very Hot");
	}

}
