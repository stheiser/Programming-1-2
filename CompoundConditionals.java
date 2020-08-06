import javax.swing.JOptionPane;

public class CompoundConditionals 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter an integer between 1 and 100");
		int num = (int)(Double.parseDouble(input)+0.5);		//convert string to integer value
		
		if(num > 100 || num < 1)	
		{
			System.out.println("Your number " + num + " is not between 1 and 100. Shame!");
		}
		else if(num % 2 == 0)	//checks to see if the number is even
		{
			System.out.println("Your number " + num + " is even.");
		}
		else //if(num % 2 != 0)		//number is odd
		{
			System.out.println("Your number " + num + " is odd");
		}
	}

}
