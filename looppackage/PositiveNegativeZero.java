package looppackage;

import java.util.Scanner;

public class PositiveNegativeZero {

	//Write a program to enter the numbers till the user wants 
	//and at the end it should display the count of positive, negative and zeros entered. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variable declaration
		int num;
		
		
		int count=0;
		int countP=0;
		int countZ=0;
		 char ch;
		 
	        do
	        {
	            System.out.print("Enter the number ");
	        	Scanner scanner = new Scanner(System.in);
	            num = scanner.nextInt();
	 
	            if(num<0)
	            {
	            	 count++;
	            	System.out.print("Number is negative,and the count is"+count++);
	            	
	            }
	 
	            if(num>0)
	            {
	            	countP++;
	            	System.out.print("Number is positive,and the count is"+countP++);
	            	
	            }else if(num==0)
	            {
	            	countZ++;
	            	System.out.println("Number is zero,and the count is"+countZ++);
	            	
					
	            }
	            	
	 
	            System.out.println("Do you want to continue y/n? ");
	            ch = scanner.next().charAt(0);
	 
	        }while(ch=='y' || ch == 'Y');
	 
	}

}
