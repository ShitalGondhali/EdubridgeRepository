package arraypackage;

public class June9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] marks={23.56f,89.36f,78.65f,95.52f};
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[0]+"    "+marks[1]+"    "+marks[2]+"    "+marks[3]);
		
		//THIS METHODS RETURNS CLASS NAME
		System.out.println(marks.getClass());
		
		//THIS METHODS LENGTH OF SPECIFIED ARRAY
		System.out.println(marks.length);
		
		int[] rollNo ={1,2,3,4,5,6};
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		System.out.println(rollNo[3]);
		System.out.println(rollNo[4]);
		System.out.println(rollNo[5]);
		
		System.out.println(rollNo[0]+"    "+rollNo[1]+"    "+rollNo[2]+"    "+rollNo[3]+" "+rollNo[4]+"    "+rollNo[5]);
		
		//THIS METHODS RETURNS CLASS NAME
		System.out.println(rollNo.getClass());
		
		//THIS METHODS LENGTH OF SPECIFIED ARRAY
		System.out.println(rollNo.length);
		
		System.out.println(rollNo.clone());
		
	}

}
