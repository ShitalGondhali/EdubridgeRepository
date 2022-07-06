import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {

	boolean flag = false;
	static int n;
	static int i;
	public int findIndex(int[]array,int size,int snum) 
	{
			for(i=0;i<n/2;i++) 
	
			{
		
				if(snum==array[i]) 
				{
					flag = true;
					break;
			
				}
			}

			if(flag) 
			{
				return i;
	
			}else 
			{
				return -1;
			}
	}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int[] array=new int[n];
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Enter the array size:");
				n=scanner.nextInt();
				
				System.out.println("Enter the array input:");
				for(i=0;i<n;i++)
				{
					
					array[i]=scanner.nextInt();
				}
				//for(int a: array)
				//{
					
				//}
				System.out.println("The array inputs are:"+Arrays.toString(array));
				
				
				System.out.println("Enter the snum:");
				int snum=scanner.nextInt();
				
				FindIndex findIndex=new FindIndex();
				findIndex.findIndex(array, n, snum);

		

		
	}
}
