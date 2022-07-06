package conditionpackage;

import java.util.Scanner;

public class DayNumberName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////variable declaration 
		int dNo;
		
		
		//taking value from user using scanner class
				System.out.print("Enter day number:");
				Scanner scanner=new Scanner(System.in);
				dNo=scanner.nextInt();
				
				switch(dNo) 
				{
				case 1: System.out.print("Monday");
				break;
				
				case 2: System.out.print("Tuesday");
				break;
				
				case 3: System.out.print("wednesday");
				break;
				
				case 4: System.out.print("Thursday");
				break;
				
				case 5: System.out.print("Friday");
				break;
				
				case 6: System.out.print("Saturday");
				break;
				
				case 7: System.out.print("Sunday");
				break;
				
				default:System.out.print("Invalid day number you have pressed.");
				}
	}

}
