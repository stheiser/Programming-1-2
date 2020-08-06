
public class GreeterTest 
{
	public static void main(String[] args)
	{
		Greeter worldGreeter = new Greeter("World");
		System.out.println(worldGreeter.sayHello());
		
		Greeter daveGreeter = new Greeter("Dave");
		System.out.println(daveGreeter.sayHello());
		
		Greeter noGreeter = new Greeter();
		System.out.println(noGreeter.sayHello());
	}
}
