import java.util.Scanner;

public class IllegalArgumentTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter the radius");
		int radius = console.nextInt();
		System.out.print("Enter the height");
		int height = console.nextInt();
		System.out.println("The volume is " 
		+ IllegalArgument.getVolume(radius, height));

	}

}
