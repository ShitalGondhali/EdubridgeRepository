package compostion;

public class TestDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(253,"shital",30000,new Project("CreateWeb",20));
		
		Department department=new Department(1234,"Sales",employee);         
		department.employee.displayDetails();  
		System.out.println(department.deptName);
		
	}

}
