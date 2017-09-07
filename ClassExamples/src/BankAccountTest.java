public class BankAccountTest
{
	public static void main(String[] args)
	{
		BankAccount lotsaMoolah = new BankAccount();
		System.out.println("Your opening balance is :$" + lotsaMoolah.checkBalance());
		
		System.out.println("Your new balance after deposit is :$" + lotsaMoolah.deposit(1974.29));
		lotsaMoolah.withdraw(1000000);
		System.out.println("The balance after withdawal is :$" + lotsaMoolah.checkBalance());
		
		
	}
}