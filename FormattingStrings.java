import javax.swing.JOptionPane;

public class FormattingStrings 
{

	public static void main(String[] args) 
	{
		System.out.printf("%10.2f", 9323423.1233);
		JOptionPane.showMessageDialog(null, "Welcome to Heiser.com Please shop responsibly");
		String itemName = JOptionPane.showInputDialog("Please type item name");
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount"));
		final double TAX_RATE = 0.079;
		double tax = TAX_RATE*quantity*price;
		double total = tax + quantity*price;
		System.out.printf("Name:%15s\tPrice $%010.2f\tTax $%10.2f\tTotal $%10.2f", itemName, price, tax, total);
		/*double decimal = 169.123456789;
		String name = "Glue";
		System.out.printf("The number is $%-10.2f%10s", decimal, name);
		*/
	}

}
