package compostion;

public class Employee {
///Example of aggregation
	int empId;
	String empName;
	double salary;
	Project project;
	public Employee(int empId, String empName, double salary,Project project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.project=project;
	}
	
	public void taxFind()
	{
		System.out.println("We found the tax");
	}
	
	public void displayDetails()
	{
		System.out.println("Details are displayed"+empId+ " " +empName+ " " +salary );
		System.out.println(project);
	}
	
}
