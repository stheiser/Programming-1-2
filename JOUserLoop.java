import javax.swing.JOptionPane;

public class JOUserLoop 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter an integer 1 to 10");
		if(input == null)			//user pressed Cancel
		{
			JOptionPane.showMessageDialog(null, "You have chosen to Cancel");
			System.exit(0);
		}
		else if (input.equals(""))		//user pressed OK without typing a number
		{
			JOptionPane.showMessageDialog(null, "You have entered nothing");
			System.exit(0);
		}
		else							//assumes an integer was typed
		{
			int num = Integer.parseInt(input);
		
			while(num < 0 || num > 10)
			{
				input = JOptionPane.showInputDialog("Invalid entry.  Please enter an integer 1 to 10");
				if(input == null || input.equals(""))
				{
					JOptionPane.showMessageDialog(null, "You are exiting");
					System.exit(0);
				}
				else
				{
					num = Integer.parseInt(input);
				}	
			}
			JOptionPane.showMessageDialog(null, "Thank you! You entered " + num);
		}
		System.exit(0);
	}	
}
