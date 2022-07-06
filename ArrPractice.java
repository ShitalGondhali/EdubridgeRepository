import java.util.Scanner;

public class ArrPractice {

	public static void main(String [] args)
	{
		int i=0;
		System.out.println("Enter array elements:");
		Scanner scanner=new Scanner(System.in);
			int[] array=new int[4];
			for(i=0;i<4;i++)
			{
			
			 array[i]=scanner.nextInt();
			}
			
			System.out.println("Array length is: "+array[i]);
			for(i=0;i<4;i++)
			{
			
			for(int j=4;j<=1;j--) 
			{
	
				System.out.println(array[j]);
	 
			}
			}
			//System.out.println("Array length is: "+array.length);
			//for(int a: array)
			//{
			//	System.out.println(a);
		 
			//}
	 }
}

