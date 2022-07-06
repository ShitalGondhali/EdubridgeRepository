package stringpackage;

public class Unicode {
	

		   public static void main(String[] args) {
		  
		    String str = "RISING STAR";
		    System.out.println("The String is : " + str);
		        
		    // codepoint at index 3
		    int index1 = str.codePointAt(3);
		    
		    // codepoint at index 7
		    int index2 = str.codePointAt(7);
		        
		    // prints character at index1 in string
		    System.out.println("Character(unicode point) = " + index1);
		    // prints character at index9 in string
		    System.out.println("Character(unicode point) = " + index2);
		  }
		}


