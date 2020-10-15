package com.datastructures;
import java.util.HashMap;
import java.util.Map;

public class MapInterface
{
	public static void main(String[] args)
	{
		var animals = new HashMap<String, Integer>();
		animals.put("dog", 1);
		animals.put("horse", 2);
		animals.put("rabbit", 66);
		
		int dogNumber = animals.get("dog");
		int rabbitNumber = animals.get("rabbit");
		System.out.println("Number of rabbits in the zoo: " + rabbitNumber);
		
		int size = animals.size();
		if (animals.containsKey("horse"))
			System.out.println("Zoo has horses");
		
		if (animals.containsValue(1))
			System.out.println("There is 1 dog here.");
		
		animals.forEach((k, v) -> System.out.println(k + " = " + v));
		
		Map zoo = Map.of("dog", 1,
				"horse", 2,
				"rabbit", 68);
		System.out.println(zoo.get("horse"));
	}
}
