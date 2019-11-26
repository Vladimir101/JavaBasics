public class Point
{
	private double x, y;

	// constructor
	public Point(double xx, double yy)
	{
		x = xx;
		y = yy;
	}

	// distance between (x,y) and origin (0,0)
	public double distance()
	{
		return Math.sqrt(x * x + y * y);
	}

	// distance between (x,y) and (x0,y0)
	public double distance(double x0, double y0)
	{
		return Math.sqrt((x - x0) * (x - x0) + (y - y0) * (y - y0));
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
