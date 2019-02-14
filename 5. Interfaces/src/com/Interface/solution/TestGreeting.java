package com.Interface.solution;

public class TestGreeting
{
	public static void main(String[] args)
	{
		Greeting greet = new Hello();
		greet.greet();
		
		greet = new Hi();
		greet.greet();
	}
}
