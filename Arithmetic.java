import java.util.Scanner;

public class Arithmetic {
      public static void main(String[] args) {
    	  
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

        	//performing arithmetic operations
        	
        	
        	//addition operator performs below,
        	//it takes two numbers and will print the addition of that number
            System.out.println(num1+num2);
            

        	//subtraction operator performs below,
            //it takes two numbers and will print the subtraction of those number
            System.out.println(num1-num2);
            

        	//Multiplication operator performs below,
            //it takes two numbers and will print the Multiplication  of those number
            System.out.println(num1*num2);
            

        	//division operator performs below,
            //it takes two numbers and will print the division of those number
            System.out.println(num1/num2);
            

        	//Modulus operator performs below,
            //it takes two numbers and will print the the remainder (integer division only)
            System.out.println(num1%num2);
          }
 
}
