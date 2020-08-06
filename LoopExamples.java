import java.io.FileNotFoundException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class LoopExamples 
{
	public static void main(String [] args)throws FileNotFoundException
	{
		int num = 10;
		
		while (num != 0)
		{
			System.out.printf("%3d%n", num);
			num +=2 ;
		}
		
		//int num = 1;
		//char move = (char)num;
		//System.out.println(move);
		/*
		 
		StringTokenizer tokenizer = new StringTokenizer(s, "*");
		
		while (tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextToken());
		}
		*/
		/*Random generator = new Random();
		
		for (int i = 1; i <= 100; i++)
			{
			System.out.println(generator.nextInt(100));
			}
		*/
		/*String input = JOptionPane.showInputDialog("Enter file path");
		FileReader reader = new FileReader(input);
		Scanner file = new Scanner(reader);
		
		while (file.hasNext())
		{
			int x = file.nextInt();
			System.out.println(x);
		}
		
		file.close();
		*/
		/*
		for (int i = 1; i <= 1000000; i++)
		{
			System.out.println(i);
		}
		*/
		
		/*
		boolean done = false;
		
		while(!done)
		{
			String input = JOptionPane.showInputDialog("Please enter your password");
			if (input == null)
			{
				System.out.println("Operation cancelled");
				System.exit(0);
			}
			else if ( input.equals("PassWerd"))
			{
				done = true;
				System.out.println("Access Granted");
			}
			
		}
		*/
		/*do
		{
			System.out.println("Hello");
		}
		while (true);*/
		//double balance = 10000;
		//double targetBalance = 20000;
		
		/*(for (int i = 1; balance <= targetBalance; i++)
		{
			balance = balance*Math.pow(1 + 0.05, i);
			System.out.println(balance);
		}
		*/
	}
	
}
