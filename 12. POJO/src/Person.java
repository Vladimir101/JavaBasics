public record Person(String firstName, int age, Address address)
{
	public Person
	{
		if (age < 21)
			System.out.println("Cannot vote");
	}
}
