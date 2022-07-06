package innerclassexample;

public class LocalInnerClassEx2 {

	String str="Edubridge";
	int batchCode=2022-7469;
	
	//it is just simple method of LocalInnerClassEx2
		public void showDetails()
		{
			System.out.println("I am learning at "+str+" And my batch code is "+batchCode);
		}
		
		
		//creating local inner class
		public void local()
		{
			//This is localInner class
			class LocalInner
			{
				//method of local inner class
				void display()
				{
					System.out.println("I am method of Local Inner class which is inside the public void local() method");
				}
			}
			LocalInner localinner;
			new LocalInner().display();
		}
		public static void main(String [] args)
		{
			LocalInnerClassEx2 localInnerClassEx2=new LocalInnerClassEx2();
			localInnerClassEx2.showDetails();
			
			localInnerClassEx2.local();
		}
}
