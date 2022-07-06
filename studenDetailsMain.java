
public class studenDetailsMain {
	public static void displayDetails(StudentDetails student)
	{
		System.out.println(student.studName+" "+student.studId+" "+student.studAge);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails student=new StudentDetails(123,"Shital",23);
		System.out.println(student);
		displayDetails(student);
		
	}

}
