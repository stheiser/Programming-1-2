import javax.swing.JOptionPane;

public class ConditionalsExamples 
{

	public static void main(String[] args) 
	{
		//System.out.println(10 < 7);
		//int x = 100;
		//int y = 100;
		/*
		if(x < y)
		{
			System.out.println("x is less than y");	//statement to be executed if condition1 is true
		}
		else if (x > y)
		{
			System.out.println("x is greater than y");	//statement to be executed if condition2 is true
		}
		else
		{
			System.out.println("x and y are equal");	//if neither condition is true
		}
		*/
		
		/*if (x < y)
		{
			System.out.println("boooyah");
		}
		if (x == y)
		{
			System.out.println("nope");
			System.out.println("boogeyman lives");
		}
		if ( x > y)
		{
			System.out.println("oh yeah");
		}
		*/
		/*int dieRoll = (int)(Math.random()*6 + 1);
		//System.out.println(dieRoll);
		switch(dieRoll)
		{
		case 1: System.out.println("one"); break;
		case 2: System.out.println("two"); break;
		case 3: System.out.println("three"); break;
		case 4: System.out.println("four"); break;
		case 5: System.out.println("five");break;
		case 6: System.out.println("six"); break;
		default: System.out.println("Error"); break;
		}
		
		if (dieRoll == 1)
		{
			System.out.println("one");
		}
		else if (dieRoll == 2)
		{
			System.out.println("two");
		}
		else if (dieRoll == 3)
		{
			System.out.println("three");
		}
		else if (dieRoll == 4)
		{
			System.out.println("four");
		}
		else if (dieRoll ==5)
		{
			System.out.println("five");
		}
		else if (dieRoll == 6)
		{
			System.out.println("six");
		}
		else
		{
			System.out.println("error");
		}
		*/
		
		String input = JOptionPane.showInputDialog("type the word for a digit ex- one");
		switch(input.toLowerCase())
		{
		case "one": System.out.println("1"); break;
		case "two": System.out.println("2"); break;
		case "three": System.out.println("3"); break;
		case "four": System.out.println("4"); break;
		case "five": System.out.println("5");break;
		case "six": System.out.println("6"); break;
		default: System.out.println("Error"); break;
		}
	}

}
