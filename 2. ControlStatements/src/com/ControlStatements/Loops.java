package com.ControlStatements;
public class Loops
{
	// change count to 11
	public static void main(String[] args)
	{
		// while loop
		int count = 1;
		while (count < 11)
		{
			System.out.println("Count is: " + count);
			count++;
		}

		// do-while loop
		count = 1;
		do
		{
			System.out.println("Count is: " + count);
			count++;
		}
		while (count < 11);

		// for loop
		for (int i = 1; i < 11; i++)
		{
			if (i == 3)
				continue;
			System.out.println("Count is: " + i);
			if (i == 6)
				break;
		}
	}
}
