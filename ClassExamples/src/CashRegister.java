
public class CashRegister 
{
	public CashRegister()		//default constructor
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public CashRegister(int somePennies, int someNickels, int someDimes, int someQuarters)
	{
		pennies = somePennies;
		nickels = someNickels;
		dimes = someDimes;
		quarters = someQuarters;
	}
	
	public double totalMoney()
	{
		return pennies*0.01 + nickels*0.05 + dimes*0.10 + quarters*0.25;
	}
	public int pennyCount()
	{
		return pennies;
	}
	public int nickelCount()
	{
		return nickels;
	}
	public int dimesCount()
	{
		return dimes;
	}
	public int quarterCount()
	{
		return quarters;
	}
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
}
