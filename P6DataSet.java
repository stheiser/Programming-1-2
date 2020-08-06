
public class P6DataSet 
{
	public P6DataSet()
	{
		sum = 0;
		numScores = 0;
	}
	
	public void addData(double x)
	{
		sum = sum + x;
		numScores++;
	}
	
	public double getAvg()
	{
		return sum/numScores;
	}
	
	public int getNumScores()
	{
		return numScores;
	}
	
	private double sum;
	private int numScores;
}
