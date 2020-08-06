import javax.swing.JOptionPane;

public class LoopsExamples 
{

	public static void main(String[] args) 
	{
		int x = (int)(Math.random()*6+1);	//generates a random int from 1 to 6
		
		switch(x)
		{
		case 1: System.out.println("one"); break;
		case 2: System.out.println("two"); break;
		case 3: System.out.println("three"); break;
		case 4: System.out.println("four"); break;
		case 5: System.out.println("five"); break;
		case 6: System.out.println("six"); break;
		default: break;
		}
		
		String input = JOptionPane.showInputDialog("Type an integer from one to six.  Ex: 1 is one");
		switch(input.toLowerCase())
		{
		case "one": System.out.println("One"); break;
		case "two": System.out.println("Two"); break;
		case "three": System.out.println("Three"); break;
		case "four": System.out.println("Four"); break;
		case "five": System.out.println("Five"); break;
		case "six": System.out.println("Six"); break;
		default: System.out.println("invalid entry"); break;
		}
		
		String input1 = JOptionPane.showInputDialog("Type a digit from 0 to 9");
		char digit = input1.charAt(0);
		switch(digit)
		{
		case '0': System.out.println("Zero"); break;
		case '5': System.out.println("Five"); break;
		case '9': System.out.println("Nine"); break;
		
		default: System.out.println("invalid entry"); break;
		}
	}

}
