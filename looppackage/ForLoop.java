package looppackage;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=20;i=i+2)
		{
			System.out.println(i+"   \n");
		}
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+i+"="+i*2);
		}
		
		
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		}
		for(char ch='z';ch>='a';ch--)
		{
			System.out.println(ch);
		}
		int i=0;
		while(i<=10)
		{
			System.out.println("hello-->"+i);
			i++;
		}
		int h=100;
		while(i>=0)
		{
			System.out.println("hello-->"+h);
			i--;
		}


	}
	

}
