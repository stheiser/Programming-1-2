import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Please provide your name.");
		
		
		
	
	
		JOptionPane.showMessageDialog(null, "Your name is " + input.toLowerCase() + ".");
		//System.out.println("Your name has " + input.length() + " characters.");
		System.exit(0);
		

	}

}
