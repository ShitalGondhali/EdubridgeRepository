
public class ExceptionExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int num=14/0;
			}catch(Exception ex)
			{
			System.out.println("base exception");
			}catch(ArthmeticException e)
			{
				System.out.println("child exception");
			}

	}

}
