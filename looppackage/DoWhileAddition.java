package looppackage;

import java.util.Scanner;

public class DoWhileAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//variable declaration
		int number1;
		int number2;
		char ch;
		do {
		//taking value from user using scanner class
				System.out.println("Enter first number:");
				Scanner scanner=new Scanner(System.in);
				number1=scanner.nextInt();
				
				System.out.println("Enter second number:");
				number2=new Scanner(System.in).nextInt();
				
				//adding two numbers
				int sum=number1+number2;
				System.out.println("The sum of two numbers is:"+sum);
				
				//asking to user whether wants to continue or not, if y is pressed it will continue,
				//and if any letter is pressed it will terminate
				System.out.println("Do you want to continue:");
				ch=new Scanner(System.in).next().charAt(0);
				
				
		}while(ch=='y'|| ch=='Y' );

	}

}
