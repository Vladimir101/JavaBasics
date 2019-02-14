package com.Arrays;

import java.util.Arrays;

public class ArrayComparison
{
	public static void main(String[] args)
	{
		String[] books1 = {"War and Peace", "Farewell to Arms", "Hamlet"};
		String[] books2 = {"War and Peace", "Farewell to Arms", "Hamlet"};

// check references		
		if (books1 == books2)
			System.out.println("==: Arrays are equal");
		else
			System.out.println("==: Arrays are NOT equal");

// check contents
		if(Arrays.equals(books1, books2))
			System.out.println("equals: Arrays are equal");
		else
			System.out.println("equals: Arrays are NOT equal");

	}
}
