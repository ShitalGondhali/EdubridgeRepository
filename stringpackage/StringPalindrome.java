package stringpackage;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner scanner=new Scanner(System.in);
		String str=scanner.next();*/
		
		String str="Mgm";
		
		StringBuilder stringBuilder=new StringBuilder(str);
		stringBuilder=stringBuilder.reverse();
		System.out.println(stringBuilder);
		
		if(str.equalsIgnoreCase(stringBuilder.toString()))
		{
			System.out.println("String is palindrome");
			
		}else
			System.out.println("String is not palindrome");
	}

}
