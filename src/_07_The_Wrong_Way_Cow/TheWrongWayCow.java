/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	char[][] directions = new char[field.length][field[0].length];
    	int upCows = 0;
    	int downCows = 0;
    	int rightCows = 0;
    	int leftCows = 0;
    	
        for (int row = 0; row < field.length; row++)
        {
        	for (int col = 0; col < field[row].length; col++)
        	{
        		if (field[row][col] == 'c')
        		{
        			//check up
        			if (row - 2 >= 0)
        			{
        				if (field[row - 1][col] == 'o' && field[row - 2][col] == 'w')
        				{
        					directions[row][col] = 'u';
        					upCows ++;
        					break;
        				}
        			}
        			//check down
        			if (row + 2 < field.length)
        			{
        				if (field[row + 1][col] == 'o' && field[row + 2][col] == 'w')
        				{
        					directions[row][col] = 'd';
        					downCows ++;
        					break;
        				}
        			}
            		//check right
        			if (col + 2 < field[0].length)
        			{
        				if (field[row][col + 1] == 'o' && field[row][col + 2] == 'w')
        				{
        					directions[row][col] = 'r';
        					rightCows ++;
        					break;
        				}
        			}
            		//check left
        			if (col - 2 >= 0)
        			{
        				if (field[row][col - 1] == 'o' && field[row][col - 2] == 'w')
        				{
        					directions[row][col] = 'l';
        					leftCows ++;
        					break;
        				}
        			}
        			
        			directions[row][col] = '.';
        		}
        	}
        }
        TheWrongWayCowTest.show(directions);
        
        char direction = 0;
        if (upCows == 1)
        	direction = 'u';
        else if (downCows == 1)
    		direction = 'd';
        else if (rightCows == 1)
    		direction = 'r';
        else if (leftCows == 1)
    		direction = 'l';
        
        for (int row = 0; row < directions.length; row++)
        {
        	for (int col = 0; col < directions[row].length; col++)
        	{
        		if (directions[row][col] == direction)
        		{
        			int[] coords = new int[] {col, row};
        			System.out.println(col + " " + row);
        			return coords;
        		}
        	}
        }
        
        return null;
    }
}
