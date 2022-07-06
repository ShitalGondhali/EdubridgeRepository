package employeepackage;

public class Admin {

	public String User_name;
	public String password;
	public Admin(String user_name, String password) {
		super();
		User_name = user_name;
		this.password = password;
	}
	public String getUser_name() {
		return User_name;
	}
	public String getPassword() {
		return password;
	}
	
   
	}