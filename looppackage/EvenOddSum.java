package looppackage;

import java.util.Scanner;

public class EvenOddSum {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int number;
				int evenSum=0;
				int oddSum=0;
				char choice;
				
				Scanner sc=new Scanner(System.in);
				do 
				{
					
				System.out.println("enter number");
				number=sc.nextInt();
				
				if(number%2==0)
				{
					evenSum +=number;
				}else
				{
					oddSum +=number;
				}
				System.out.println("do you want to continue y");
				choice = sc.next().charAt(0);
				
			}while(choice=='y' || choice=='Y');
				
				System.out.println("Sum of even number " +evenSum);
				System.out.println("Sum of odd number " +oddSum);
				
			
			}

	}
