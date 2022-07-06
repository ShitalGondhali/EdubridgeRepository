package looppackage;

public class ArrayevenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,ecount=0,ocount=0;
		while(i<=20)
		{
			if(i%2==0) {
			System.out.println("even-->"+i);
			ecount++;
			}
			else {
				System.out.println("odd-->"+i);
			ocount++;
			}
			i++;
		}
		System.out.println(ecount +"   " +ocount);
	}

}
