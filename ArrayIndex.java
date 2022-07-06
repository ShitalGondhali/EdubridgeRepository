import java.util.Scanner;

public class ArrayIndex {

	
	public static void findIndex()
	{
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=scanner.nextInt();
		
		Integer [] arrInput=new Integer[n];
		
		System.out.println("Enter input array:");
		for(int i=0;i<n;i++) 
		{
			arrInput [i] =scanner.nextInt();
		}
		int i;
		System.out.println(arrInput[i]);

	}

}
