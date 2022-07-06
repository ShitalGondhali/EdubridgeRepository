package exceptionpackage;
import java.util.Scanner;
public class ArrayProblemEx 
{

		public static void main(String[] args) 
		{
			
			
			System.out.println("start of the program");
			
			Scanner scanner=new Scanner(System.in);
			int number;
			
			String message=null;
			
			int[] array= {1,2,3,4,5};
			
			try 
			{
				
				number=scanner.nextInt();//pavitra  
				int length=message.length();//nullpointer
				System.out.println(array[4]);//new ArrayIndexOutOfBounds exception object
			
			}
			catch(ArrayIndexOutOfBoundsException  exception) 
			{
				System.out.println("Index position 5 not present"+exception.getMessage());
			}
			
			catch(NullPointerException ex)
			{
				System.out.println("object is null, ref variable is pointing to null"+ex.getCause());
			}
			
			catch(Exception e)//Baseclass baseClass=new ChildClass();
			{
				System.out.println("other exception"+e.getClass());
			}
			
			System.out.println("end of the program");
			
		}

	}

