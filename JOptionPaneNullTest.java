import javax.swing.JOptionPane;

public class JOptionPaneNullTest 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Please enter your name");
		
		if (input == null)
		{
			System.out.println("You pressed the cancel button");
			System.out.println("You entered " + input);
			input = JOptionPane.showInputDialog("Enter your name");
		}
		else if (input.equals(""))
		{
			System.out.println("You pressed the ok button without typing anything");
			System.out.println("You entered an empty string");
		}
		else
		{
			System.out.println("You pressed the ok button");
			System.out.println("You entered " + input);
		}
		System.exit(0);
	}

}
