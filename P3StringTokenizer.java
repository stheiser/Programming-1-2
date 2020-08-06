import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class P3StringTokenizer 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Item number, item name, and item price separated by commas");
		StringTokenizer tokenizer = new StringTokenizer(input, ",");
		
		while(tokenizer.hasMoreTokens())
		{
			String word = tokenizer.nextToken();
			int itemNum = Integer.parseInt(word);
			System.out.println(itemNum);
			word = tokenizer.nextToken();
			System.out.println(word);
			word = tokenizer.nextToken();
			double price = Double.parseDouble(word);
			System.out.printf("$%1.2f",price);
		}
		System.exit(0);
	}

}
