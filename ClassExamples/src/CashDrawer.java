
public class CashDrawer 
{
	//Defualt Constructor
	
	public CashDrawer()
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	//parameterized constructor
	public CashDrawer(int somePennies, int someNickels, int someDimes, int someQuarters)
	{
		pennies = somePennies;
		nickels = someNickels;
		dimes = someDimes;
		quarters = someQuarters;
	}
	
	//methods
	public int getPennies()
	{
		return pennies;
	}
	
	public int getNickels()
	{
		return nickels;
	}
	
	public int getDimes()
	{
		return dimes;
	}
	
	public int getQuarters()
	{
		return quarters;
	}
	
	public double getTotalMoney()
	{
		return pennies*0.01 + nickels*0.05 +dimes*0.10 + quarters*0.25;
	}
	
	//instance fields

		private int pennies;
		private int nickels;
		private int dimes;
		private int quarters;
}
