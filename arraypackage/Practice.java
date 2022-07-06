package arraypackage;

import java.io.InputStream;
import java.util.Scanner;

public class Practice
{
		
		public static void main(String[] args) {
				
			char val;
			System.out.println("enter the character");
	
			val=new Scanner(System.in).next().charAt(0);
		if (Character.isUpperCase(val)) 
		{
			  System.out.println("Character is in Uppercase!");
		}else 
		{
			   System.out.println("Character is in Lowercase!");
		}

		

	}

		

}		