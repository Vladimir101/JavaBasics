public class TestPoint
{
	public static void main(String[] args)
	{
		Point point = new Point(3, 4);

		double distance = point.distanceFromOrigin();
		System.out.println("Distance from origin for (" +
				point.getX() + ", " + point.getY() +
				") is " + distance);

// Java 10 - type inference for LOCAL variables
// Variables must be initialized at the time of declaration		
		var point2 = new Point(24, 66);
	}
}
