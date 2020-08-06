
public class BankAccountTest 
{
	public static void main(String[]args)
	{
		//objects and outputs
		System.out.println("Welcome to Bank of Heiser");
		BankAccount heiserChecking = new BankAccount(100000);
		System.out.println("$" + heiserChecking.getBal());
		
		heiserChecking.deposit(500);
		System.out.println("$" + heiserChecking.getBal());
		heiserChecking.withdraw(13000);
		System.out.println("$" + heiserChecking.getBal());
		
		BankAccount hChecking = new BankAccount(15000);
		System.out.println("$" + hChecking.getBal());
		
		hChecking.deposit(500);
		System.out.println("$" + hChecking.getBal());
		hChecking.withdraw(13000);
		System.out.println("$" + hChecking.getBal());
	}
}
