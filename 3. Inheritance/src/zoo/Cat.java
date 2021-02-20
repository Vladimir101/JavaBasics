package zoo;

public class Cat extends Animal
{
	public Cat(String aType)
	{
		super(aType);
	}
	
	public void eat() 
	{
		System.out.println("Cats drink milk.");
	}
}
