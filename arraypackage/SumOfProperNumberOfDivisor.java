package arraypackage;

import java.util.Scanner;

public class SumOfProperNumberOfDivisor {

	public static void findPerfect()
	{
		
		
		System.out.println("Enter the number:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		
		
		if(number<0 || number>32767)
	    {
	    	//return -1;
	    	System.out.println("Invalid Input"); 
	    }
		for(int i=1;i<number;i++)//i=1,2,3,4,5,6
		{                        //num=2,i=1,2
			if(number%i==0)//6%1=0,0,0,1,1,0
			{			   //2%1=0,
				sum=sum+i;//0+1=1,  1+1=2, 2+1=3, 
				//Now sum is 6
				System.out.println(i);
							//0+1=1,  
			}
		}
		
		if(sum==number)///sum=6,number=6
		{
			System.out.println(number+"  "+"This number is Perfect number");
		}
		else
			System.out.println(number+"  "+"This number is not Perfect number");
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findPerfect();////why here we are giving this 2 or any number as argument
	}

}
