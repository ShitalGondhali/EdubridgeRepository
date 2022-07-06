package conditionpackage;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.print("Enter character:");
		Scanner scanner=new Scanner(System.in);
		ch=scanner.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.print("Character is an alphabet");
		}else if(ch>='0' && ch<='9')
		{
			System.out.print("Character is digit");
		}else
			System.out.print("Character is a special character");
	}

}
