import java.io.*;
import java.util.Scanner;
 
class AssSub {
    public static void main(String[] args)
    {
    	 //variable declaration
        int num1;
        int num2;
        
       //accepting values from user using Scanner Class
        System.out.print("Enter first number:");
		Scanner scanner=new Scanner(System.in);
		
		//accepting first value as num1
		num1=scanner.nextInt();
		
		//accepting second value as num2
        System.out.print("Enter second number:");
    	num2=scanner.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Subtracting & Assigning values
        num1 -= num2;
        //num1=num1-num2
        
        
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
        
        
        
        
        
        
    }
}

