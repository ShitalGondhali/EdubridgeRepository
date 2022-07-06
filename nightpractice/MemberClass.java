package nightpractice;

public class MemberClass 
{
	public class Member
	{
	int num1=10;
	int num2=80;
		
	public void add()
	{
		System.out.println("The Addition is: "+(num2+num1));
	}
		
	public void sub()
	{
		System.out.println("The Subtraction is: "+(num2-num1));
	}	
	}
   
	
	public static void main(String[] args) 
	{
		MemberClass.Member member=new MemberClass().new Member();
		member.add();
		member.sub();
     
	}

}
