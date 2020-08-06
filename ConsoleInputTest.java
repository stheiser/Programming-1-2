import java.util.Scanner;

public class ConsoleInputTest 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Heiser Bank. \nPlease enter your account number");
		Scanner console = new Scanner(System.in);
		
		int actNum = console.nextInt();
		System.out.println("Please enter your password");
		String password = console.next();
		System.out.println("Your account number is " + actNum);
		
		
		System.out.println("Your password is " + password);
		console.close();

	}

}
