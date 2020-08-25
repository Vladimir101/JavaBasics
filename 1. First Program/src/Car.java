
public class Car
{
	private double startMiles; 	// Starting odometer reading
	private double endMiles; 	// Ending odometer reading
	private double gallons; 	// Gallons of gas used between the readings
	
	public Car(double sm, double em, double gallonsPerRide)
	{
		startMiles = sm;
		endMiles = em;
		gallons = gallonsPerRide;
	}
	
	public double calculateMPG() // calculates and returns the miles per gallon for the car
	{
		return (endMiles - startMiles)/gallons;
	}
}
