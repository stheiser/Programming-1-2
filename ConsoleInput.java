/*
 * The program will get input from a user in the console
 */
import java.util.Scanner;
public class ConsoleInput {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = console.nextInt();
		System.out.println("You have entered " + age + " as your age");
		System.out.println("Please enter your name");
		String name = console.next();
		System.out.println("Your name is " + name);
		System.out.println("Please enter your weight");
		double weight = console.nextDouble();
		System.out.printf("Your weight is %5.1f", weight);
		console.close();
		
	}

}
