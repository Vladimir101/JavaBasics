public class Point
{
	private double x, y;
	
// constructor
	public Point(double xx, double yy)
	{
		x = xx;
		y = yy;
	}
	
	public double distanceFromOrigin()
	{
		return Math.sqrt(x*x + y*y);
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}	
}
