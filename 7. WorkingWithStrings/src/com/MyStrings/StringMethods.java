package com.MyStrings;

public class StringMethods
{
	public static void main(String[] args)
	{
		String palindrome = "Madam Im Adam";
		char ch = palindrome.charAt(2);
		System.out.println("Char [2]: " + ch);
		
		int pos = palindrome.indexOf('I');
		System.out.println("Position of I: " + pos);
		
		int length = palindrome.length();
// indent was introduced in Java 12
		System.out.print(("Palindrom length: " + length).indent(3));
		
		String palindrome2 = "Madam Im Adam";
		
		if (palindrome.equals(palindrome2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are NOT equal");
		
		int intVar = 24;	 
        float floatVar = 6.6f;
        char charVar = 'V';
        String strVar = "Hello, Java 12";

// displaying formatted string
        System.out.printf("The formatted string: %d %f %c %s\n", 
        		intVar , floatVar, charVar, strVar);
        
        String str = new String("String");
        String str2 = new String("String");
        if (str == str2)
        	System.out.println("==: Strings are equal");
        else
        	System.out.println("==: Strings are not equal");
	}
}
