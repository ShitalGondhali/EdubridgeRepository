

package testpackage123;
import departmentpackage.Department;
import departmentpackage.Project;
import employeepackage.Admin;
import employeepackage.Employee;
import employeepackage.Manager;

public class TestPackageDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee employee = new Employee(50000,"Ajinkya","Navi Mumbai","Deployment","ajinkya123@gmail.com");
      
      System.out.println(employee.getDept());
      System.out.println(employee.getNm());
      
      
      Manager manager = new Manager("Rahul","Pune");
      
      System.out.println(manager.getMname());
      System.out.println(manager.getAddress());
      
      Admin admin = new Admin("ShitalGondhali","S123456789");
      
      System.out.println(admin.getUser_name());
      System.out.println(admin.getPassword());
      
      Department department = new Department("Computer Science");
      System.out.println(department.getDname());
      
      Project project = new Project(12,"Online Net Banking");
      System.out.println(project.getTeam_size());
      System.out.println(project.getPname());

      
	}

}