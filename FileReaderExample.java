import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileReaderExample 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		String password = JOptionPane.showInputDialog("Please enter your password");
		
		FileReader reader = new FileReader("score.dat");
		Scanner file = new Scanner(reader);
		
		String word = file.next();
		
		file.close();
		
		if (password.equals(word))
			System.out.println("Your password is correct");
		else
			System.out.println("Nice try hacker wannabe");
		
		System.exit(0);
	}

}
