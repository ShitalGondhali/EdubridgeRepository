package sundaypracticepackage;

import java.util.Scanner;

public class SundayJuly3rd
{

	public void print()
	{
		int i;
		int[] array=new int[4];
		Scanner scanner=new Scanner(System.in);
	
		for(i=0;i<=array.length;i++)
			
		{
			array[i]=scanner.nextInt();
			
		}
		System.out.println(array[i]);
	}
	public static void main(String[] args) 
	{
		SundayJuly3rd sundayJuly3rd=new SundayJuly3rd();
		sundayJuly3rd.  print();
		
		
	}

}
