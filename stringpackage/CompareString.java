package stringpackage;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="TODAY";
		String str2="TODAY";
		String str3="SUNDAY";
		String str4="MONDAY";
		
		System.out.println("Comparing two strings lexicographically");
		
		System.out.println("Comparing character sequence of first string "  +str1+  " Comparing character sequence of second string "  +str2);
		
		System.out.println(str1.compareTo(str2));
		
		
		System.out.println("Comparing character sequence of first string "  +str2+  " Comparing character sequence of second string "  +str3);
		
		System.out.println(str2.compareTo(str3));
		
		
		System.out.println("Comparing character sequence of first string "  +str3+  " Comparing character sequence of second string "  +str4);
		
		System.out.println(str3.compareTo(str4));
	}

}
