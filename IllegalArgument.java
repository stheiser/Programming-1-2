
public class IllegalArgument 
{
	public static double getVolume(int r, int h)
	{
		if(r <= 0 || h <= 0)
		{
			throw new IllegalArgumentException("Invalid radius and/or height");
		}
		return Math.PI*r*r*h;
	}
}
