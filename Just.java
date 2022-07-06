	import java.util.Scanner;

	public class Just {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number");
			num=scanner.nextInt();
			
			if(num>18)
			{
				System.out.println("Number is Greater than 18");
			}else
			{
				System.out.println("Number is not greater than 18");
			}
			

		}

	}
