package conditionpackage;

import java.util.Scanner;

public class DayNumberMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	////variable declaration 
			int dayNo;
			
			
			//taking value from user using scanner class
					System.out.print("Enter day number:");
					Scanner scanner=new Scanner(System.in);
					dayNo=scanner.nextInt();
					
			//checking condition using switch case
					switch(dayNo)
					{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.print("This month have 31 days.");
					break;
					
					
					case 2:System.out.print("This is 2nd month which name is February,This month have 28 days,And in the leap year its having 29 days.");
					break;
					
					
					case 4:
					case 6:
					case 9:
					case 11:
						System.out.print("This month have 30 days.");
					break;
						
					default:System.out.print("You are entering invalid month number,Please do check.");
					}
	}

}
