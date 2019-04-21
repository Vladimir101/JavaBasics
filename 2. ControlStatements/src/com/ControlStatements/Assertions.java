package com.ControlStatements;

// use asserts to verify assumptions
public class Assertions
{
	public static void main(String[] args)
	{
		int a = 70;
		int b = 66;
		
		assert b > 23;
		assert 1 > 11; // comment this line to execute assertion on line 12
		assert a - b < 4 : a - b + " must be less than 4";
	}
}
