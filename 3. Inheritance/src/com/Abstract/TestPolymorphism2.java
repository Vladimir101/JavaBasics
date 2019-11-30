package com.Abstract;

public class TestPolymorphism2
{
	public void animalEat(Animal animal)
	{
		animal.eat();
	}
	
	public static void main(String[] args)
	{
		TestPolymorphism2 test = new TestPolymorphism2();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		test.animalEat(dog);
		test.animalEat(cat);
// add Cow		
	}
}
