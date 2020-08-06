import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter your age in years.");
		int age = Integer.parseInt(input);
		//System.out.println("Your middle name is " + input);
		System.out.println("Your age is " + age);
		System.exit(0);

	}

}
