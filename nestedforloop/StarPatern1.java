package nestedforloop;

public class StarPatern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<4;j++) {//j=0 0<4 
			  for(int i=0;i<=j;i++)//i=4 4<4
			  {
				System.out.print("*");//*
									  //**
				                      //***
				                     // ****
			  }
			  System.out.println();
		}
	}

}
