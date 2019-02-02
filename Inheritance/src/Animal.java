
public class Animal
{
	private String type;

// constructor	
	public Animal(String aType)
	{
		type = aType;
	}
	
	public void eat()
	{
		System.out.println("eating...");
	}

// getters and setters	
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}
