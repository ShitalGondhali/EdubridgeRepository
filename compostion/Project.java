package compostion;

public class Project {
	
	String projectName;
	int duration;
	public Project(String projectName, int duration) {
		super();
		this.projectName = projectName;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", duration=" + duration + "days]";
	}
	
	
	
	/*public void printProjectDetails()
	{
		System.out.println(pro);
	}*/
}
