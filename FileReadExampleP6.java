import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadExampleP6 
{

	public static void main(String[] args)throws FileNotFoundException 
	{
		FileReader reader = new FileReader("src\\number.dat");
		Scanner file = new Scanner(reader);
		
		
		
		//String name = file.nextLine();
		//System.out.println("The contents of line one are " + name);
		
		int num1 = (int)file.nextDouble();		//reads in first number in file
		int num2 = (int)file.nextDouble();
		
		
		System.out.println("The first number in the file is " + num1);
		System.out.println("The second number in the file is " + num2);
		
		System.out.println(Math.round(3.45));
		file.close();
	}

}
