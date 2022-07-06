package looppackage;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration
		int number1,number2;
		int pow=1;
		
		//taking value from user using scanner class
		System.out.print("Enter first number:");
		Scanner scanner=new Scanner(System.in);
		number1=scanner.nextInt();
		
		System.out.print("Enter second number:");
		number2=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=number2; i++) {//2 pow 5
		pow=pow*number1;
		}
		System.out.print(number1+ " "+number2);
		
	System.out.println("pow"+pow);
		

	}

}
