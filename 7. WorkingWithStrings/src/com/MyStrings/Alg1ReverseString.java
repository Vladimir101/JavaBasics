// Algorithm 1. Write a method that returns the reverse string
package com.MyStrings;

public class Alg1ReverseString
{
	public String reverseString(String str)
	{
		char[] letters = str.toCharArray();
		int strLength = letters.length;
		char var;
		
		for (int i = 0; i < strLength/2; i++)
		{
			var = letters[i];
			letters[i] = letters[strLength - 1 - i];
			letters[strLength - 1 - i] = var;
		}
		return new String(letters);
	}

	public static void main(String[] args)
	{
		var alg1 = new Alg1ReverseString();
		String str = "I like Java";
		System.out.println(alg1.reverseString(str));
	}
}
