public record Person(String firstName, int age)
{
	public Person
	{
		if (age < 21)
			System.out.println("Cannot vote");
	}
}
