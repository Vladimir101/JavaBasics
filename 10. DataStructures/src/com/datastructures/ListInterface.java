package com.datastructures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface
{
	public static void main(String[] args)
	{
// Java 10 - type inference for LOCAL variables		
		var names = new ArrayList<String>();
		names.add("Ann");
		names.add("Cindy");
		System.out.println(names);
		
		names.add(1, "Bob");
		names.remove(0);
		names.set(0, "Donald");
		String name1 = names.get(1);
		System.out.println(name1);
		
		int size = names.size();
		System.out.println("Number of elements in the list: " + size);
// Java 8		
		names.forEach(name -> System.out.println(name));
		List<String> list = Arrays.asList("Vlad", "Tony", "Boris", "Sofya");
		System.out.println(list);
	}
}
