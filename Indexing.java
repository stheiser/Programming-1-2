
public class Indexing {

	public static void main(String[] args) 
	{
		/*int balance = 500;
		int deposit = -100;
		
		if (deposit < 0)
		{
			throw new IllegalArgumentException("Negative deposits disallowed");
		}
		balance = balance + deposit;
		System.out.println(balance);
		
		String name = "Little Bert";
		//System.out.println(name.indexOf('e'));
		//System.out.println(name.substring(9,15));
		*/

		int sum = 98;

	for (int i = 1; i <= 100; i= i+13)

	{

		sum = sum - i;

		if (sum < 0)
		{
			System.out.println(i);
			System.out.println(sum);
			throw new IllegalArgumentException("Sum became negative");
		}
	}
	}
}
