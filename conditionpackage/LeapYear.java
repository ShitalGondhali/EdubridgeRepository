package conditionpackage;

	import java.util.Scanner;

	public class LeapYear {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int year;
			
			System.out.println("Enter year : ");
			Scanner scanner = new Scanner(System.in);
			year=scanner.nextInt();
			
			if(((year%4 ==0)&&(year%100==0)) || (year%400==0)) 
			{
				System.out.println("The year is Leap year");
			}else {
				System.out.println("The year is not Leap year");
			}
			
		}

	}
