package conditionpackage;

import java.util.Scanner;

public class Ass5Ques2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNo;
		String name;
		int marksOfPhysics;
		int marksOfChemistry;
		int marksOfComputerApplication;
		float totalMarks;
		
		System.out.print("Input the Roll Number of the student :");
		Scanner scanner=new Scanner(System.in);
		rollNo=scanner.nextInt();
		System.out.print("Input the Name of the Student :");
		name=scanner.next();
		System.out.print("Input the marks of Physics, Chemistry and Computer Application :");
		marksOfPhysics=scanner.nextInt();
		marksOfChemistry=scanner.nextInt();
		marksOfComputerApplication=scanner.nextInt();
		totalMarks=(marksOfPhysics+marksOfChemistry+marksOfComputerApplication);
		float res=totalMarks/(100+100+100);
		//System.out.println("res:"+res);
		double percentage1=(res)*100;
		
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name of Student:"+name);
		System.out.println("Marks in Physics:"+marksOfPhysics);
		System.out.println("Marks in Chemistry :"+ marksOfChemistry);
		System.out.println("Marks in Computer Application:"+marksOfComputerApplication);
		System.out.println("Total Marks = "+totalMarks);
		System.out.println("Percentage = "+percentage1);
		if( percentage1>=80)
		{
			System.out.println("Division= First");
		}else
		{
			System.out.println("Pass");
		}
	}

}
