
public class Atm 
	{

	//member variable or instance variable or object variable
	private double amount;
	
	//No-Arguments constructor
	Atm(){
		amount=1000;
	}
	Atm(double amount)
	{
		this.amount=amount;
	}
	
	@Override
	public String toString() {
		return "Atm [amount=" + amount + "]";
	}
	
		
	public void deposit(double amount)//10000
	{
		this.amount=this.amount+amount;
		//1000=1000+10000
	}
	public double withdraw(double amount)
	{
		this.amount=this.amount-amount;
		return this.amount;
	}
	public double checkBalance()
	{
		return amount;
	}

}
