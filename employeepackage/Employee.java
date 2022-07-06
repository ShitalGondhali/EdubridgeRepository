package employeepackage;

public class Employee {
	public int sal;
	public String nm;
	public String addrs;
	public String dept;
	public String email;
	
	public  Employee(int sal,String nm,String addrs,String dept,String email)
	{
		this.sal=sal;
		this.nm=nm;
		this.addrs=addrs;
		this.dept=dept;
		this.email=email;
	}

	public int getSal() {
		return sal;
	}

	public String getNm() {
		return nm;
	}

	public String getAddrs() {
		return addrs;
	}

	public String getDept() {
		return dept;
	}

	public String getEmail() {
		return email;
	}
 
	public void setSal(int sal) {
		this.sal = sal;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee=new Employee(30000,"Shital","Navi Mumbai","DevlopingTeam","shital12@gmail.com");
		System.out.println(employee);
		System.out.println(employee.getSal()+"    "+employee.getNm()+"     "+employee.getAddrs()+"    "+employee.getDept()+"    "+employee.getEmail());
		
	}

}
