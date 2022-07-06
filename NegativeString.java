import java.util.Scanner;
import java.util.StringTokenizer;

public class NegativeString {

	
	public static String negativeString(String s)
	{
		
		//String s1=new Scanner(System.in).next();
		//This is just a misconception.
		System.out.println(s.replace(" is "," is not "));
		/*String str = "is";
		String str1="is not";*/
		
		/*StringTokenizer stringtokenizer=new StringTokenizer(s);
		System.out.println(stringtokenizer);
		
		StringBuffer buffer=new StringBuffer(s);
		if(str=="is" || str=="Is" )
		{
			buffer.replace(6, 7, str1);
			buffer.append(buffer);
		}
		buffer.toString();
		System.out.println(buffer);*/
		return s;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeString neg=new NegativeString ();
		negativeString("Today is misty"); 
		
	}

}
