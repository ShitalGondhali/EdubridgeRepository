package attendancemgmntsystem;

public class Admin extends Person{

	
	public Admin(String id, String name, String password,String email) 
	{
		super(id, name, password, email);
		
	}

	Teacher[] teacherList=new Teacher[15];//instance variable
	static int count=0;
	
	
	public void addNewTeacher(Teacher teacher)
	{
		teacherList[count++]=teacher;
	}
	
	public void viewTeacherList()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(teacherList[i]);
		}
	}
	
	 
	public void modifyTeacher(String id, String password)
	{
		for(int i=0;i<count;i++)
		{
			if(teacherList[i].id.equals(id))
			{
				teacherList[i].password=password;
				break;
			}
		}
	}
	
	
	public void getTeacherById(String id)
	{
		for(int i=0;i<count;i++)
		{
			if(teacherList[i].id.equals(id))
			{
				System.out.println(teacherList[i]);
				break;
			}
		}
	}
	
	public void removeTeacherById(String id)
	{
		int pos=-1;
		for(int i=0;i<count;i++)
		{
			if(teacherList[i].id.equals(id))//0
			{
				pos=i;
				break;
						
			}
		}
		for(int k=pos;k<count;k++)
		{
			teacherList[k]=teacherList[k+1];//1=2
		}
		if(pos>=0) {
		count--;
		}
	}
}
