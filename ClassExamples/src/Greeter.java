
public class Greeter {
	public Greeter()		//default constructor
	{
		name = "Mr. Heiser";
	}
	
	public Greeter (String aName)  //constructor
	{
		name = aName;
	}

	public String sayHello()
	{
		String message = "Hello, " + name;
		return message;
	}
	//public String sayAnything()
	//{
		//String message = "Hello, " + name + "!";  //local variable
		//return message;
	//}
	
	private String name;	//instance field
}
