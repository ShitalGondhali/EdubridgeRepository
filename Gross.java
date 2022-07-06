import java.util.Scanner;

public class Gross {

	double basicSalary;
	int dayWork;
	
	public static void calculateGross(double basicSalary,int dayWork)
	{
		//this.basicSalary=basicSalary;
		//this.dayWork=dayWork;
		
		if(basicSalary>10000 || basicSalary<0)
		{
			
			System.out.println("Invalid Input");
			
		}
		
		if( dayWork>31 || dayWork<=0 )
		{
			System.out.println("Invalid Input");
		}else
		{
		double houseRentAllow=(basicSalary/2);
		double speacialAllowance=(0.75*basicSalary);
		//double grossSal=(basicSalary/30);
		double grossSalary=basicSalary+houseRentAllow+speacialAllowance;
		System.out.println("The Gross salary is:"+grossSalary);
		}
	
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the salary:");
		double basicSalary=scanner.nextDouble();
		
		System.out.println("Enter the days he worked:");
		int dayWork=scanner.nextInt();
		
		Gross.calculateGross(basicSalary, dayWork);
		
	}
}
