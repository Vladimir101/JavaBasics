
public class TestPerson
{
	public static void main(String[] args)
	{
		Person p = new Person("Tony", 20, new Address(43, "Main"));
		System.out.println(p.firstName());
		System.out.println(p.age()); 
	}
}
