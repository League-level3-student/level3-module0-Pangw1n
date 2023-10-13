package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] array = new String[5];
    	array[0] = "hey you";
    	array[1] = "out there in the cold";
    	array[2] = "getting lonely";
    	array[3] = "getting old";
    	array[4] = "can you feel me?";
        // 2. print the third element in the array
    	System.out.println(array[2]);
        // 3. set the third element to a different value
    	array[2] = "We don't need no education";
        // 4. print the third element again
    	System.out.println(array[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < array.length; i++)
    	{
    		array[i] = "ha";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < array.length; i++)
    	{
    		System.out.println(array[i]);
    	}
        // 7. make an array of 50 integers
    	int[] numArray = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	for (int i = 0; i < numArray.length; i++)
    	{
    		numArray[i] = new Random().nextInt(100);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallestInt = numArray[0];
    	int largestInt = numArray[0];
    	for (int i : numArray)
    	{
    		if (i < smallestInt)
    		{
    			smallestInt = i;
    		}
    		if (i > largestInt)
    		{
    			largestInt = i;
    		}
    		System.out.print(i + ", ");
    	}
    	System.out.print("\n");
    	
    	System.out.println(smallestInt);
    	System.out.println(largestInt);
    	System.out.println(numArray[numArray.length - 1]);
        // 10 print the entire array to see if step 8 was correct
    	
        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
