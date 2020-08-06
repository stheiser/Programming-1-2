import javax.swing.JOptionPane;

public class P3Unit6While 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter a positive number");
		while(input != null || !input.equals(""))
		{
			double num = Double.parseDouble(input);
			boolean done = false;
			while(!done)
			{
				if(num > 0)
				{
					done = true;
				}
				else
				{
				input = JOptionPane.showInputDialog("Enter a positive number");
				}		
			}
			System.exit(0);
		}

	}

}
