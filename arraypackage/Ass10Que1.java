package arraypackage;

import java.util.Scanner;

public class Ass10Que1 {

	 void newArraysum()
	{
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no.of elements you want:");
		int n=scanner.nextInt();
		
		System.out.println("Enter no.of elements you want:");
		int [] age=new int[10];
		for(int i=0;i<n;i++)
		{
			age[i]=scanner.nextInt();
			if(age[i]>=18)
			{
				sum+=age[i];
			}
			
		}
		System.out.println("Sum of age of employees are:"+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10Que1 ass10Que1=new Ass10Que1();
		ass10Que1.newArraysum();
	
		
	
}


	
}

	


