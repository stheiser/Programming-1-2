import java.util.Scanner;
import java.util.StringTokenizer;

public class P6StringTokenizer 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
	
		System.out.println("Type a sentence");
		String input = console.nextLine();  		//gets user input
		
		StringTokenizer tokenizer = new StringTokenizer(input);
		
		while(tokenizer.hasMoreTokens())		//as long as there are more tokens
		{
			String word = tokenizer.nextToken();
			System.out.println(word);
		}
		console.close();
	}

}
