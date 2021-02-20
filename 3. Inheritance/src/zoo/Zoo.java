package zoo;

public class Zoo
{
	private Animal[] animals;
	private final int numberOfCages = 15;
	private int nextEmptyCage = 0;
	
	public Zoo()
	{
		animals = new Animal[numberOfCages];
	}
	
	public void add(Animal a)
	{
		if (nextEmptyCage < numberOfCages)
		{
			animals[nextEmptyCage] = a;
			nextEmptyCage++;
		}
		else
			System.out.println("All cages are taken!");
	}
	
	public void feed()
	{
		for (int i = 0; i < nextEmptyCage; i++)
			animals[i].eat();
	}
	
	public int getNextEmptyCage()
	{
		return nextEmptyCage;
	}
}
