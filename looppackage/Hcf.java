package looppackage;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration
		int a;
		int b;
		int hcf=0;
		 
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number :");
	      a = sc.nextInt();
	      System.out.println("Enter second number : ");
	      b = sc.nextInt();

	      for(int i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
	      System.out.println("HCF of given two numbers is ::"+hcf);
	}

}
