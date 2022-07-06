public class June7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper class
		int number=100;
		int number1=200;
		Integer integer=new Integer(number);//AUTO BOXING;
		System.out.println(number);
		System.out.println(integer);
		
		
		//USING THE METHODS OF INTEGER WRAPPER CLASS
		//BIT COUNT METHOD-----WILL RETURN NO. OF ONE BIT IN THE TWO'S COMPLEMENT OF THE SPECIFIED NUMBER
		System.out.println(Integer.bitCount(1000));
		
		//BYTE VALUE METHOD
		byte b=integer.byteValue();
		System.out.println(b);
		
		//THESE METHODS CONTAINS MINIMUM VALUE AND THE MAXIMUM VALUE FOR AN INT RESPECTIVELY
		System.out.println(Integer.MIN_VALUE+ " " +integer.MAX_VALUE);
		
		//RETURNS STRING FOR THE INTEGER ARGUMENT WITH THE BASE 16-----STATIC METHOD
		String value=Integer.toHexString(17);
		System.out.println(value);
		
		//RETURNS STRING FOR THE INTEGER ARGUMENT WITH THE BASE 8-----STATIC METHOD
		String value1=Integer.toOctalString(17);
		System.out.println(value1);
		
		//RETURNS STRING FOR THE INTEGER ARGUMENT WITH THE BASE 2-----STATIC METHOD
		String value2=Integer.toBinaryString(7);
		System.out.println(value2);
		
		
		//this methods compares two integers numerically-----if same=0--different=-1
		System.out.println(Integer.compare(number, number1));
		
		//Compares two Integer objects numerically
		System.out.println(integer.compareUnsigned(number, number1));
		
		//Returns the value obtained by reversing the order of the bits in the two's complement binary representation of the specified int value.
		//STATIC METHOD
		System.out.println(Integer.reverse(number));

		
		//Returns the value of this Integer as a short.
		short abc=integer.shortValue();
		System.out.println(abc);
		
		//Returns the signum function of the specified int value.
		//STATIC METHOD
		System.out.println(Integer.signum(number));
		
		//
		

	}

}
