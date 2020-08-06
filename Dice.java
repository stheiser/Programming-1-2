
public class Dice 
{
	public Dice()
	{
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
	}
	public void addRoll(int x)
	{
		switch(x)
		{
		case 0: one++; break;
		case 1: two++; break;
		case 2: three++; break;
		case 3: four++; break;
		case 4: five++; break;
		case 5: six++; break;
		}
	}
	public int getOnes()
	{
		return one;
	}
	public int getTwos()
	{
		return two;
	}
	public int getThrees()
	{
		return three;
	}
	public int getFours()
	{
		return four;
	}
	public int getFives()
	{
		return five;
	}
	public int getSixes()
	{
		return six;
	}
	private int one, two, three, four, five, six;
}
