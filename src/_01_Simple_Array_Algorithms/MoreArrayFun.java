package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		new MoreArrayFun().Run();
	}

	void Run()
	{
		String[] Array = new String[4];
		Array[0] = "Gilmour";
		Array[1] = "Waters";
		Array[2] = "Wright";
		Array[3] = "Mason";
		printArray(Array);
		System.out.println("");
		printInverseArray(Array);
		System.out.println("");
		printSpacedArray(Array);
		System.out.println("");
		printRandomArray(Array);
	}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printArray(String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
			if (i < array.length - 1)
			{
				System.out.print(", ");
			}
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	void printInverseArray(String[] array)
	{
		for (int i = array.length - 1; i >= 0; i--)
		{
			System.out.print(array[i]);
			if (i >= 1)
			{
				System.out.print(", ");
			}
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	void printSpacedArray(String[] array)
	{
		for (int i = 0; i < array.length; i += 2)
		{
			System.out.print(array[i]);
			if (i < array.length - 1)
			{
				System.out.print(", ");
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	void printRandomArray(String[] array)
	{
		String[] newOrder = new String[array.length];
		
		for (int i = 0; i < newOrder.length; i++)
		{
			while (newOrder[i] == null)
			{
				int x = new Random().nextInt(array.length);
				newOrder[i] = array[x];
				array[x] = null;
			}
		}
		
		for (int i = 0; i < newOrder.length; i++)
		{
			System.out.print(newOrder[i]);
			if (i < newOrder.length - 1)
			{
				System.out.print(", ");
			}
		}
	}
}
