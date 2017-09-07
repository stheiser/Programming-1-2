public class BankAccount
{
	//default constructor
	public BankAccount()
	{
		balance = 0;	//set account balance to $0
	}
	//parameterized constructor
	public BankAccount(double num1)
	{
		balance = num1;		//sets account balance to amount deposited at opening
	}
	//check balance method
	public double checkBalance()
	{
		return balance;
	}
	//deposit method
	public double deposit(double amount)
	{
		balance = balance +amount;		//updates the balance with addition of deposit
		return this.checkBalance();
	}
	
	//withdraw method
	public void withdraw(double amount)
	{
		balance = balance - amount;		//updates the balance with removal of deposit
		return;
	}
	
	//instance fields
	private double balance;
}