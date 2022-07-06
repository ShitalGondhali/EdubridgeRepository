package attendancemgmntsystem;

public class Course extends Person {

	
	String[] enrolledStudents=new String[10];
	String[] Lectures=new String[10];
	Teacher teacher;
	public Course(String id, String name, String password, String email, String[] enrolledStudents, String[] lectures,
			Teacher teacher)
	{
		
		super(id, name,password,email);
		this.enrolledStudents = enrolledStudents;
		Lectures = lectures;
		this.teacher = teacher;
		
	}

	
}
