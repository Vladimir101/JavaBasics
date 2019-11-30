package com.Inheritance;

public class Cat extends Animal
{

	public Cat(String aType)
	{
		super(aType);
	}

// method overriding	
	public void eat()
	{
		System.out.println("Cats eat fish");
	}
}
