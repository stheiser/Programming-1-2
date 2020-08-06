
public class Greeter 
{
	public Greeter()
	{
		name = "Voldemort";
	}
	public Greeter(String aName)		//constructor
	{
		name = aName;					//stores the variable aName in the instance field name
	}
	
	public String sayHello()			//method
	{
		String message = "Hello, " + name + "!";
		return message;
	}
	private String name;
}
