
public class BankAccount 
{	//constructors

	public BankAccount()			//default constructor
	{
		balance = 0;
	}
	
	public BankAccount(double aBal)
	{
		balance = aBal;
	}
	//methods(withdraw, deposit, getbalance) 
	
	public void withdraw(double aWith)
	{
		balance = balance - aWith;
	}
	
	public void deposit(double aDep)
	{
		balance = balance + aDep;
		
	}
	
	public double getBal()
	{
		return balance;
	}
	//instance variables
	
	private double balance;
}
