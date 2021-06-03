package com.arrays;

public class Alg2BubbleSort
{
	public void bubbleSort(int[] array)
	{
		int temp;
		
		for (int j = array.length - 1; j >= 1; j--)
			for (int i = 0; i < j; i++)
				if (array[i] > array[i + 1])
				{
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
		for (int a : array)
			System.out.println(a);
	}

	public static void main(String[] args)
	{
		int[] array = { 1, 11, 0, 8, 6, 101, 26, 25 };
		var alg2 = new Alg2BubbleSort();
		alg2.bubbleSort(array);
	}
}
