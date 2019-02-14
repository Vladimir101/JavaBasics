package com.Arrays;

public class WorkingWithArrays
{
	public static void main(String[] args)
	{
		int[] myArray; int myArray2[];
		myArray = new int[66];
		
		String[] myStrings; String myStrings2[];
		myStrings = new String[2];
		myStrings[0] = new String("Tony");
		myStrings[1] = "Vlad";
		
		for (int i = 0; i < myStrings.length; i++)
			System.out.println(myStrings[i]);
		
		for (String string: myStrings)
			System.out.println(string);

// array initialization		
		String[] family = {"mama", "papa"};
	}
}
