package attendancemgmntsystem;

public class Person {

	String id;
	String name;
	String password;
	String email;
	public Person(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
