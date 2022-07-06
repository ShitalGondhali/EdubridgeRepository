package stringpackage;

public class IndexString {
	
		   public static void main(String[] args)
		    {
		        String str = "RAINING TODAY";
		        System.out.println("The String is  = " + str);
		        
		        // Get the character at positions 1 and 8.
		        int index1 = str.charAt(1);
		        int index2 = str.charAt(8);

		        // Printing the results.
		        System.out.println("The character at position 1 is " +
		            (char)index1);
		        System.out.println("The character at position 8 is " +
		            (char)index2);
		    }
		}


