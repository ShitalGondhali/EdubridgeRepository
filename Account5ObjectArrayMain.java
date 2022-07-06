
public class Account5ObjectArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1st object created here
		Account5ObjectArray account1=new Account5ObjectArray("Saving",9572017);
		
		Account5ObjectArray account2=new Account5ObjectArray("Saving",9552017);
		
		Account5ObjectArray account3=new Account5ObjectArray("Current",95720012);
		
		Account5ObjectArray account4=new Account5ObjectArray("Saving",89524317);
		
		Account5ObjectArray account5=new Account5ObjectArray("Current",957456217);
		
		
		Account5ObjectArray[] accountarray=new 	Account5ObjectArray[5];
		
		accountarray[1]=account1;
		accountarray[2]=account2;
		accountarray[3]=account3;
		accountarray[4]=account4;
		accountarray[4]=account5;
		
		
		System.out.println(accountarray); 
		
		System.out.println(accountarray[1].accType+"  "+accountarray[1].accNo); 
		System.out.println(accountarray[2].accType+"  "+accountarray[2].accNo); 
		System.out.println(accountarray[3].accType+"  "+accountarray[3].accNo); 
		System.out.println(accountarray[4].accType+"  "+accountarray[4].accNo); 
		System.out.println(accountarray[4].accType+"  "+accountarray[4].accNo); 
	}

}
