package com.Inheritance;
public class Dog extends Animal
{
	private String name;
	private String breed;
	
	public Dog(String aType, String aName, String aBreed)
	{
		super(aType);
		name = aName;
		breed = aBreed;
	}

// method overriding	
	public void eat()
	{
		System.out.println("Dogs eat bones");
	}
	
	public void bark()
	{
		System.out.println("barking...");
	}

	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}
}
