import javax.swing.JOptionPane;

public class FormatStings
{

	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(s);
		String input = JOptionPane.showInputDialog(message)
		int num = 1;
		num++;	//makes the variable increment by 1 more
		num = num + 1;  //same as num++
		//System.out.println(num);
		double weight = 102.731;
		//System.out.printf("%,10.2f%n", weight);
		int quantity = 120;
		//System.out.printf("%10d%n", quantity);
		String item = "popsicle";
		//System.out.printf("%10s", item);
		System.out.printf("Weight:%10.2f\tQuantity:%6d\tItem:%10s%n", weight, quantity, item);
		weight = 151.456;
		quantity = 32;
		item = "bananas";
		System.out.printf("Weight:%10.2f\tQuantity:%6d\tItem:%10s%n", weight, quantity, item);
		weight = 0.48;
		quantity = 7;
		item = "frisbee";
		System.out.printf("Weight:%10.2f\tQuantity:%6d\tItem:%10s%n", weight, quantity, item);
		weight = 5.45;
		quantity = 2;
		item = "Hydroflask";
		System.out.printf("Weight:%10.2f\tQuantity:%6d\tItem:%10s%n", weight, quantity, item);
	}

}
