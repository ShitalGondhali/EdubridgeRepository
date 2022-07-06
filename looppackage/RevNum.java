package looppackage;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;

		//taking value from user using scanner class
				System.out.print("Enter number:");
				Scanner scanner=new Scanner(System.in);
	
				num1=scanner.nextInt();
				int rev=0;
				
				//System.out.print(num1);	
				while(num1!=0)//123 12 1
				{
					int rem=num1%10;//rem=3 2
					rev=rev*10+rem; //32 321
					num1=num1/10;//1 0
					
				}
				System.out.print(rev);
				
	}

	

}
