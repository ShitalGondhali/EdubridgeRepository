package looppackage;

import java.util.Scanner;

public class PrintTableOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
		int num;
		char ch;
		
		//using do ... while loop to check whether user wants to continue or not
		do {
		//taking values from user
		System.out.println("Enter the Number:");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		
		//checking that number is positive or not using if..else statement 
		if(num>0)
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+i*num);
			}
		System.out.println("Do you wants to continue:");
				ch=new Scanner(System.in).next().charAt(0);

		}while(ch=='y' || ch=='Y');

}
}
