package com.MyStrings.solution;

public class YourInitials
{
	public static void main(String[] args)
	{
// Compute your initials from your full name and display them on the same line
		String name = "Vladimir Belorusets";
		int space = name.indexOf(' ');
		char first = name.charAt(0);
		char last = name.charAt(space + 1);
		System.out.print(first);
		System.out.println(last);

// Try 
		System.out.println(first + last);
// Why the output is integer?
// Solution:
		System.out.printf("%c%c", first, last);		
	}
}
