
public class AtmTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm atm=new Atm();
		
		System.out.println(atm);
		atm.deposit(10000);
		System.out.println(atm);
		double amount=atm.withdraw(3000);
		//System.out.println("withdrawl amount = "+amount);
		
		System.out.println(atm.checkBalance());
		
		Atm atm1=new Atm(10000);
		atm1.deposit(9000);
		System.out.println(atm1);
	}

}