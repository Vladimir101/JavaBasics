package com.Inheritance;

public class Cat extends Animal
{

	public Cat(String aType)
	{
		super(aType);
	}

// method overriding
	@Override
	public void eat()
	{
		System.out.println("Cats eat fish");
	}
}
