package com.Inheritance;

public class TestInheritance
{

	public static void main(String[] args)
	{
		Dog dog = new Dog("Small dog", "Tuzik", "Chihuahua");
		dog.bark();
		System.out.println("Dog's type: " + dog.getType());
		System.out.println("Dog's name: " + dog.getName());
	
// runtime polymorphism		
		Animal animal = new Dog("Very big dog", "Rex", "Labrador");
		animal.eat();
		System.out.println("Dog's type: " + animal.getType());
// 		animal.getName() - is invalid
		((Dog)animal).getName();
		
		animal = new Cat("Siam");
		animal.eat();
	}

}
