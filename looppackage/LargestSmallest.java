package looppackage;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 
        int number;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
 
        char ch;
 
        do
        {
            System.out.print("Enter the number ");
        	Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Do you want to continue y/n? ");
            ch = scanner.next().charAt(0);
 
        }while(ch=='y' || ch == 'Y');
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
	}

}
