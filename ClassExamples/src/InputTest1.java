import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) 
	{
	
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your age:");
		double name = console.nextDouble();
		
		System.out.println("Your square root of your age is " + Math.sqrt(name));
		//System.out.println("Your name is: " + name.toUpperCase());
		//System.out.println("The first letter of your name is: " + name.charAt(0));
		//System.out.println("The last three letters of your name are : " + name.substring(name.length() - 3, name.length()));
		console.close();
		
		
		
		
		
	}

}
