import javax.swing.JOptionPane;


public class FirstDialog 
{

	public static void main(String[] args) 
	{
		//declaration of constant variables
		final int MIN = 1;
		final int MAX = 10;
		
		//declaration of variables
		int random1 = MIN + (int)(Math.random()*MAX);	//generates # between 1 & 10
		int random2 = MIN + (int)(Math.random()*MAX);	//generates # between 1 & 10
		int difference = Math.abs(random1 - random2);	//finds the diff between random1 & random2
		boolean match = (difference ==0);				//true if diff=0 false if not=0
		
		//output statements
		System.out.println("Random #1: " + random1 + ", Random #2 : " + random2);
		System.out.println("Are the numbers a match? " + match);
		
		
		//boolean state = (12 == 33);
		//JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random()*MAX)));
		//System.out.println("The answer is " + state);
		//JOptionPane.showMessageDialog(null, "The answer is " + state);
		
		
		
		
		
		/*JOptionPane.showConfirmDialog(null,
	             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "You've done messed up", "alert", JOptionPane.ERROR_MESSAGE);
		int selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
		
		switch(selection)
		{
		case 0: System.out.println("You have made a wise choice!"); break;
		case 1: System.out.println("Doh!");break;
		case 2: System.out.println("You have cancelled"); break;
		default: break;
		}
		*/
		  
		 
		//System.out.println(selection);
		//Boolean state = (12 == 4);
		//JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random()*5)));
		//System.out.println("The answer is " + state);
		//JOptionPane.showMessageDialog(null, "The answer is " + state);
		
		/*
		
		String input2 = JOptionPane.showInputDialog("Quantity");
		String input3 = JOptionPane.showInputDialog("Tax rate as a percent");
		double price = Double.parseDouble(input1);
		int quantity = Integer.parseInt(input2);
		double taxRate = Double.parseDouble(input3)/100;
		System.out.print("Price: $" + price + "\tQuantity: " + quantity + "\tTax: $" 
		                   + price*quantity*taxRate + "\t");
		//cost of items + cost of tax on those items
		double totalCost = price*quantity + price*quantity*taxRate;
		System.out.println("Total Cost: $" + totalCost);
		*/
		
		/*String input = JOptionPane.showInputDialog("Enter one leg of a right triangle");
		String input2 = JOptionPane.showInputDialog("Enter the second leg of a right triangle");
		double leg1 = Double.parseDouble(input);
		double leg2 = Double.parseDouble(input2);
		double hypotenuse = Math.sqrt(leg1*leg1 + leg2*leg2);
		System.out.println("Hypotenuse is " + hypotenuse);
		*/
		
		
		//int age = Integer.parseInt(input2);
		//int num1 = age + 7;
		//System.out.println("Your first name is " + input + " and your age is " + age + ".");
		
		//int length = input.length();
		//System.out.println("The length of your name is " + length);
		
		
		
	}

}
