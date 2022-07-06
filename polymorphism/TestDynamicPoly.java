package polymorphism;

public class TestDynamicPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicPolymorphism  dynamicPolymorphism=new  DynamicPolymorphism();
		dynamicPolymorphism.displayDetails();
		 
		dynamicPolymorphism=new  DynamicPoly(123,"Shital","Navi Mumbai");//upcasting
		dynamicPolymorphism.displayDetails();
		 
		DynamicPoly dynamicPoly=(DynamicPoly)dynamicPolymorphism;//downcasting
		dynamicPoly.sample();
	}

}
