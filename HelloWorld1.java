import java.awt.Rectangle;

/*
 * Mr. Heiser
 * 6th period
 * This program displays Hello World to the user
 */
public class HelloWorld1
{

	public static void main(String[] args) 
	{
		//System.out.println("Hello, World!".length());
		//String name = "Hello, World!";
		//System.out.println(name.length());
		//System.out.println(new Rectangle(5,10,20,30));
		//Rectangle box = new Rectangle(5, 10, 20, 30);
		//System.out.println(box);
		
		Rectangle box = new Rectangle(5,10,20,30);
		System.out.println(box);
		Rectangle r = box;
		System.out.println(r);
	}

}
