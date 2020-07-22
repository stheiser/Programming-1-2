import java.util.function.LongToDoubleFunction;

public class HelloWorld 
{
	public static void main(String [] args)
	{
		//Variable declaration and assignment
		// Form:  type name = some value;
		int age = 44;
		System.out.println("I am " + age + " years old.");
		int side = 3;
		System.out.println("Volume of the cube is " + side*side*side);
		System.out.println("The maximum integer is " + Integer.MAX_VALUE);
		System.out.println("The minimum integer is " + Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		final int BASE_TEN = 10;
		age = 99;
		System.out.println(age);
		double length = 11.3;
		System.out.println(length/6);
		char lastInitial = 'H';
		lastInitial = 'B';
		System.out.println(lastInitial);
		String firstName = "Stephen";
		String middleName = "Douglas";
		String lastName = "Heiser";
		System.out.println("Hello, my name is " + firstName + " " + middleName + " " + lastName + ".");
		System.out.println("The number of letters in my first name is " + firstName.length());
		char letter = firstName.charAt(0);
		System.out.println(letter);
		String subName = firstName.substring(0,4);
		System.out.println(subName);
		boolean done = false;
		System.out.println(!done);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		long newNumber = 10;
		System.out.println(newNumber);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		float someNumber = 11;
		System.out.println(Float.MAX_VALUE);
		double a = 3.4;
		double b = 5.9;
		double c = Math.sqrt(a*a + b*b);
		System.out.println("The hypotenuse is " + c);
		double num1 = 10;
		System.out.println(num1);
	}
}
