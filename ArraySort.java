import java.util.Scanner;

public class ArraySort {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
	        int n;   
	        //Array Size Declaration
	        System.out.println("Enter the size of array :");
	        n=sc.nextInt();    
	        
	        Integer arr[]=new Integer[n];    //Array Declaration
	        
	        System.out.println("Enter the elements of the array :");
	        for(int i=0;i<n;i++)     //Array Initialization
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int temp = 0;    
	        
	         for (int i = 0; i < arr.length; i++)  
	         {     
	            for (int j = i+1; j < arr.length; j++)    //compares with remaining Array elements
	            {     
	               if(arr[i] < arr[j]) //Compare and swap
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }
	}

