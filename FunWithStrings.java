import javax.swing.JOptionPane;

public class FunWithStrings 
{

	public static void main(String[] args) 
	{
		
		String name = "Corona del Sol";
		System.out.println("Name: " + name);
		
		//How to get a character at a certain index
		//	stringVariableName.charAt(index or position)
		System.out.println("The character at index 2 is " + name.charAt(2));
		//System.out.println("Heiser".charAt(4));
		
		//How to convert all character in a string to uppercase
		//    stringVariableName.toUpperCase()
		System.out.println("The name as all capitals is " + name.toUpperCase());
		
		//how to convert all character in a string to lowercase
		//    stringVariableName.toLowerCase()
		System.out.println("The name as all lowercase letters is " + name.toLowerCase());
		
		//how to find the index position for a certain letter
		//	 stringVariableName.indexOf('character')
		System.out.println(name.indexOf('o'));
		
		//how to find the length of a string
		//    stringVariableName.length()
		System.out.println("The length of the name is " + name.length());	
		System.out.println("Tempe, Arizona".length());
		
		//how to get a substring (a part) of a full string
		//     stringVariableName.substring(starting index, 1 more than ending index)
		System.out.println("The three letters after 'C' are " + name.substring(1,4));
		System.out.println("The first letter is " + name.substring(0,1));
		String partName = name.substring(1,4);
		
		String input = JOptionPane.showInputDialog("Enter first name last name separated by a space");
		int space = input.indexOf(' ');
		String firstName = input.substring(0,space);
		System.out.println(firstName);
		int length = input.length();
		String lastName = input.substring(space + 1, length);
		System.out.println(lastName);
		
	}

}
