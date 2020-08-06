
public class BankTest 
{
	public static void main(String[] args)
	{
		
		Bank money = new Bank();
		System.out.println("Balance = $" + money.getBalance());
		
		Bank moolah = new Bank(1250);
		System.out.println("Balance = $" + moolah.getBalance());
		
	}
}

