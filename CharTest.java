import javax.swing.JOptionPane;

public class CharTest 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter a character");
		char letter;
		if (input.length()!=1)
		{
			System.out.println("You did not follow directions");
		}
		else
		{
			letter = input.charAt(0);
			
			if (Character.isLetter(letter))
			{
				if (Character.isUpperCase(letter))
				{
					System.out.println(letter + " is an upper case");
				}
				else
				{
					System.out.println(letter + " is a lower case");
				}
			}
			else if (Character.isDigit(letter))
			{
				System.out.println(letter + " is a digit");
			}
			else
			{
				System.out.println(letter + " is not a letter or a digit");
			}
		}
	}
}
