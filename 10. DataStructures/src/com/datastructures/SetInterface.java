package com.datastructures;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetInterface
{
	public static void main(String[] args)
	{
		var hashSet = new HashSet<String>();
		hashSet.add("element1");
		hashSet.add("element2");
		hashSet.add("element3");
		hashSet.add("element1");
		
		System.out.println("Set has no duplicates: " + hashSet);
		
		for (String element : hashSet)
			System.out.println(element);

		Map<String, String> fruits = new HashMap<String, String>();
		fruits.put("orange", "orange");
		fruits.put("banana", "yellow");
		fruits.put("grapes", "green");
		
		Set<String> keys = fruits.keySet();
		for (String key: keys)
			System.out.println(key);
		
		int numberOfKeys = keys.size();
		System.out.println("There are " + numberOfKeys + " fruits here.");
		
		hashSet.forEach(element -> System.out.println(element));		
	}
}
