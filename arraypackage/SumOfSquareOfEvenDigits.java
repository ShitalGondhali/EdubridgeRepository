package arraypackage;

import java.util.Scanner;

public class SumOfSquareOfEvenDigits {

	public static int sumSquareEven()
	{
	System.out.println("Enter number :");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();//3487
    int rem = 0, sum = 0;
    
    
    if(number<0 || number>32767)
    {
    	//return -1;
    	System.out.println("Invalid Input");
    }                
    while (number != 0) ///1234,123,12,1
    {
        rem = number % 10;//4,3,2       
        if ((rem% 2) == 0)//true,false,true,false
          sum += rem *rem;/////0=0+16=16  16=16+(2*2)=20 
        number /= 10;///123,12,1,
    }
    System.out.println(sum);
	return sum;
	}
	
	    public static void main(String[] args) {
	    	sumSquareEven();
	    	
	        
	    }
	}
