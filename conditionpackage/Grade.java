package conditionpackage;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("E ----Excellent");
		System.out.println("V ----Very Good");
		System.out.println("G----Good");
		System.out.println("A ----Average");
		System.out.println("F ----Fail");
		
		System.out.println("enter grade");
		char Grade=new Scanner(System.in).next().charAt(0);
		
		switch(Grade) 
		{
		  case'E': System.out.println("Excellent");
		  break;
		  case'V': System.out.println("Very good");
		  break;
		  case'G': System.out.println("Good");
		  break;
		  case'A': System.out.println("Average");
		  break;
		  case'F': System.out.println("Fail");
		  break;
		  
		  default : System.out.println("Enter wrong plz check");
		}
		
	}

}
