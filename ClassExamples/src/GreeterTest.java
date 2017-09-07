
public class GreeterTest {

	public static void main(String[] args) {
		Greeter worldGreeter = new Greeter(); //constructor
		System.out.println(worldGreeter.sayHello());
		
		Greeter hizoGreeter = new Greeter("Java");
		System.out.println(hizoGreeter.sayHello());
		
	}

}
