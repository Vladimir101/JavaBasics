package com.MyStrings;

public class StringManipulation
{
	public static void main(String[] args)
	{
// 1. print words of a given sentence
		String sentence = "I like learning Java";
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++)
			System.out.println(words[i]);
		
// 2. print sentence in a reverse order
		int sizeOfSentence = sentence.length();
		for (int i = 0; i < sizeOfSentence; i++)
			System.out.print(sentence.charAt(sizeOfSentence - 1 - i));
		
		System.out.println();
		for (int i = sizeOfSentence - 1; i >= 0; i--)
			System.out.print(sentence.charAt(i));

// 3. reverse sentence by using StringBuilder
		String palindrome = "Dot saw I was Tod";
		StringBuilder sb = new StringBuilder(palindrome);
		sb.reverse();
		System.out.print("\n" + sb);
		
// 4. convert string to array of characters
		char[] pal = palindrome.toLowerCase().toCharArray();
	}
}
