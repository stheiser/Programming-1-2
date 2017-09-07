
public class CashRegisterTest 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Cash Register Program");
		CashRegister chaching = new CashRegister(1100, 1045, 128, 182);
		System.out.println("You have " + chaching.pennyCount() + " pennies, " + chaching.nickelCount()+ " nickels, " + chaching.dimesCount() + " dimes, " + chaching.quarterCount() + " quarters.");
		System.out.println("Woohoo!  You have " + chaching.totalMoney() + " dollars!");
	}

}
