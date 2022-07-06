package innerclassexample;

public class MemberClassEx2 {

	public class Member
	{
		
		int number1=10,number2=20;
		void add()
		{
			int result=number1+number2;
			System.out.println("The addition of number1 and number2 is "+result);
		}
	}
	public static void main(String[] args)
	{
		MemberClassEx2.Member member=new MemberClassEx2().new Member();
		member.add();
	}

}
