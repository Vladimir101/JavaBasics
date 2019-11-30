package com.Abstract;

public class TestPolymorphism
{
	public static void main(String[] args)
	{
		Animal animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();
	}
}
