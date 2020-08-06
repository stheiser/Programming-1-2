import java.util.Random;

import javax.swing.JOptionPane;

public class DiceTest 
{
	public static void main(String[] args) 
	{
		boolean done = false;
		
		while(!done)
		{
			String input = JOptionPane.showInputDialog("Please enter number of rolls");
			if(input == null || input.equals(""))
			{
				System.out.println("goodbye");
			}				
			else
			{
				int rolls = Integer.parseInt(input);
				Random generator = new Random();
				Dice connect = new Dice();
				for (int i = 1; i <= rolls; i++)
				{
					connect.addRoll(generator.nextInt(6));
				}
		
				System.out.println("Ones: " + connect.getOnes() + " ; " + (connect.getOnes()/(rolls*1.0))*100 + "%");
				System.out.println("Twos: " + connect.getTwos() + " ; " + (connect.getTwos()/(rolls*1.0))*100 + "%");
				System.out.println("Threes: " + connect.getThrees() + " ; " + (connect.getThrees()/(rolls*1.0))*100 + "%");
				System.out.println("Fours: " + connect.getFours() + " ; " + (connect.getFours()/(rolls*1.0))*100 + "%");
				System.out.println("Fives: " + connect.getFives() + " ; " + (connect.getFives()/(rolls*1.0))*100 + "%");
				System.out.println("Sixes: " + connect.getSixes() + " ; " + (connect.getSixes()/(rolls*1.0))*100 + "%");
			
				int choice = JOptionPane.showConfirmDialog(null, "Choose One","Would you like to play again?", JOptionPane.YES_NO_OPTION);
				if(choice == 1)
				{
					done = true;
				}
			}
		System.exit(0);
		}
	}
}