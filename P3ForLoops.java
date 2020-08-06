
public class P3ForLoops 
{

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 1000; i++)
		{
			System.out.printf("%8d",i);
			if(i % 10 == 0)					//checks to see for every 10th value
			{
				System.out.println();
			}
		}

	}

}
