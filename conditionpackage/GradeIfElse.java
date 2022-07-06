package conditionpackage;

import java.util.Scanner;

public class GradeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		//taking value from user using scanner class
				System.out.print("Enter Grade:");
				Scanner scanner=new Scanner(System.in);
				grade=scanner.next().charAt(0);

				
				//Checking the condition to decide the description of specified grade
				if(grade=='E')
					System.out.print("Exellent");
				else if(grade=='V')
				System.out.print("Very Good");
				else if(grade=='G')
					System.out.print("Good");
				else if(grade=='A')
					System.out.print("Average");
				else
					System.out.print("Fail");
	}

}
