package com.datastructures.examples;

import java.util.HashMap;
import java.util.Set;

public class CheckDuplicates
{
	public static void main(String[] args)
	{
// check if the array has duplicates		
		String[] words = {"One", "Two", "One", "Eleven", "Eight", "Eight"};
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String word: words)
			hashMap.put(word, 1);
		if (words.length == hashMap.size())
			System.out.println("There are no duplicates in the array");
		else
			System.out.println("There are duplicate elements in the array");

// print all elements of the array without repeating duplicate values
		Set<String> keys = hashMap.keySet();
		for (String key: keys)
			System.out.println(key);
		
// calculate and print frequencies of elements in the array
		hashMap.clear();
		for (String word: words)
		{
			if (hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word) + 1);
			else
				hashMap.put(word, 1);
		}
		
		for (String key: keys)
			System.out.println("Element: " + key + "  - Frequency: " + hashMap.get(key));
	}
}
