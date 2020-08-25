public class TestStudent
{
	public static void main(String[] args)
	{
		Student anya = new Student();
		anya.eat();
		
		Student sasha = new Student();
		sasha.eat();
		
// set name
// set age		
		Student vasya = new Student("Vasily", "Male");
		vasya.eat();
		
// set the default constructor		
		Student masha = new Student();
		String name = masha.getName();
		System.out.println("Masha's name is " + name);
		
		masha.setName("Masha");
		masha.setGender("female");
		
		name = masha.getName();
		System.out.println("Masha's name is " + name);
		String gender = masha.getGender();
		System.out.println("Masha's gender is " + gender);
	}
}
