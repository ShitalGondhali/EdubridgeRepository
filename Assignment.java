import java.util.Scanner;

public class Assignment{
      public static void main(String[] args) {
    	  
    	  
    	  //variable declaration
          int no1;
          int no2;
          
          
          //accepting values from user
          System.out.print("Enter first number:");
  			Scanner scanner=new Scanner(System.in);
  			
  			//accepts value as num1
  			no1=scanner.nextInt();
  			
          System.out.print("Enter second number:");
      	//accepts value as num2
      		no2=scanner.nextInt();
            
            System.out.println(no1==no2); 
            System.out.println(no1+=no2);
             
            
          }
 
}
