package arraypackage;

import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int product=1;
		
		System.out.println("Enter no.of Elemetns you want:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n<0 || n>10)
		{
			System.exit(0);
		}
		int[] arr=new int[n]; 
		
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) 
		{
		
			arr[i]=scanner.nextInt();
			if(arr[i]>99)
			{
				System.exit(0);
			}
			
		}
		
			
		 for(i=0;i<n;i++)
			{      
				if(arr[i]>0)
				{
					
				product*=arr[i];
				}
			
			}
				System.out.println("Product of elemnts with array size is:"+product);
			


}
}

