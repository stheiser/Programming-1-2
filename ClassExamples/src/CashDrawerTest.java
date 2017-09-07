/*
 * This program will report the number of each type of coin 
 * and return the total amount of moolah
 */
public class CashDrawerTest 
{

	public static void main(String[] args) 
	{//objects and output statements
		System.out.println("Welcome to Heiser, INC");
		
		CashDrawer money = new CashDrawer(102, 58, 117, 127);
		
		System.out.println("There are currently " + money.getPennies() + " pennies in the drawer.");
		System.out.println("There are currently " + money.getNickels() + " nickels in the drawer.");
		System.out.println("There are currently " + money.getDimes() + " dimes in the drawer.");
		System.out.println("There are currently " + money.getQuarters() + " quarters in the drawer.");
		System.out.println("You are rich!  There is currently $" + money.getTotalMoney() + " in the drawer.");
	}

}
