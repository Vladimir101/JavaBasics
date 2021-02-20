package zoo;

public class TestZoo
{
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();
		zoo.add(new Dog("Small dog", "Tuzik", "Chihuahua"));
		zoo.add(new Cat("Siam"));
		System.out.println("Index of the next empty cage: " + zoo.getNextEmptyCage());
		
		zoo.feed();
	}
}
