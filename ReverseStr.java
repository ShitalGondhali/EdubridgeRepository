import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string that you wants to reverse:");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		String str=scanner.next();
		StringBuilder 	stringBuilder=new 	StringBuilder (str);
		System.out.println(stringBuilder.reverse());
		}
	}

}
