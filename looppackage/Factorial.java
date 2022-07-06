package looppackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration
		int i;
		int fact=1;
		
		//taking values from user
				System.out.println("Enter the Number:");
				Scanner scanner=new Scanner(System.in);
				int num=scanner.nextInt();
				
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
				
			}
			System.out.println(+fact);
			
	}

}
/*int number=new Scanner(System.in).nextInt();
int factres=1;
for(int i=number; i>0; i--)
{
	factres=factres*i;
}
System.out.println(factres);*/

