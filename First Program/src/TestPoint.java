
public class TestPoint
{

	public static void main(String[] args)
	{
		Point point = new Point(3, 4);
		double distance = point.distanceFromOrigin();
		System.out.println("Distance from origin for (" +
				point.getX() + ", " + point.getY() +
				") is " + distance);

	}

}
