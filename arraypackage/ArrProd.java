package arraypackage;

import java.util.Arrays;

public class ArrProd {
	
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				int [] arr1= {7,2,3,4};//2 3 4 7  i=2
				int [] arr2= {5,9,7,8};//9 8 7 5
				int [] output=new int[arr1.length];
				Arrays.sort(arr1);
				for(int i=0;i<arr2.length;i++)
				{
					for(int j=0;j<arr2.length;j++)
					
					if(arr2[i]>arr2[j])
					{
						int temp=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=temp;
					}
				}
				for(int a: arr2 )
				{
					System.out.println(a);
				}
				for(int i=0,j=arr2.length-1;i<arr1.length;i++,j--)
				{
					output[i]=arr1[i]*arr2[j];//i=arr1[i]=2  j=arr2[j]=5
				}
				for(int b: output )
				{
					System.out.println(b);
				}
			}

		}




