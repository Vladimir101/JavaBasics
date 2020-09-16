public class Student
{
	private String name;
	private String gender;

	public void eat()
	{
		System.out.println("I am eating sushi!");
	}
	
// test with the default constructor
	
// add getters & setters
	
// add the non-default constructor
	public Student(String n, String g)
	{
		name = n;
		gender = g;
	}

// add the default constructor	
	public Student()
	{
		name = "Adam";
		gender = "male";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
}
