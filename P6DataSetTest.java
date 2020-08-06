import java.util.Scanner;

public class P6DataSetTest 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter values. Press 'Q' to quit");
		boolean done = false;
		String num;
		P6DataSet connect = new P6DataSet();
		double value = 0;
		while(!done)
		{
			num = console.next();
			if(num.equalsIgnoreCase("Q"))
			{
				System.out.println("Thank you");
				System.out.println("Your average for " 
				+ connect.getNumScores() + " is " + connect.getAvg());
			}
			else
			{
				value = Double.parseDouble(num);
				connect.addData(value);
			}
		}
		console.close();
	}

}
