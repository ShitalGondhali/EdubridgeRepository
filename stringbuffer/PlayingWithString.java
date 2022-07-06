package stringbuffer;


	import java.util.Scanner;

	public class PlayingWithString {

		public static String formString(String[] str, int size,int position)
		{
			//str=ABC XYZ EFG MN
			//	SIZE----4
			//POSITION---3
			StringBuilder stringBuilder=new StringBuilder();
			for(int i=0;i<size;i++)//4<4
			{
				String string=str[i];//str[3] MN  3
				if(str[i].length()>=position) {//2>=3
				char ch=string.charAt(position-1);//EFG.charat(2) ch=='G'
				stringBuilder.append(ch);//CZG$
				}else
				stringBuilder.append('$');
			}
			return stringBuilder.toString();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int arraySize;
			Scanner scanner =new Scanner(System.in);
			System.out.println("enter the size");
			arraySize=scanner.nextInt();
			String[] message=new String[arraySize];
			for(int i=0;i<arraySize;i++)
			message[i]=scanner.next();
			System.out.println("enter the position of char to read");
			int position=scanner.nextInt();
			
			System.out.println(formString(message,arraySize,position));
		}

	}

