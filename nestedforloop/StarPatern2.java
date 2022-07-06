package nestedforloop;

public class StarPatern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)//This loop is for row,so there will be 5 row
		{
			for(int k=4-i;k>0;k--)//k=4-2=2
			{
				System.out.print(" ");// 2 space
			}
			for(int j=0;j<=i;j++)//0<=1  1<=1
			{
				System.out.print("*");
			}
			if(i>0) {
			for(int m=0;m<i;m++)
			{
				System.out.print("*");
			}
			}
			System.out.println();
		}
		
			/*for(int j=0;j<4;j++) {//j=0 0<4 
				  for(int i=0;i<=j;i++)//i=4 4<4
				  {
					System.out.print("*");//*
										  //**
					                      //***
					                     // ****
				  
		
		
		
		
		
		/*for(int i=1;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();		
		}*/
		}
	}


