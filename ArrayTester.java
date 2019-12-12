/*
 * AP Computer Science
 * 2018 Exam Free Response
 * 4. Array Slice
 * */
import java.util.Arrays;

public class ArrayTester
{

	public static int[] getColumn(int[][] arr2D, int c)
	{
		int[] result = new int[arr2D.length];
		for (int row = 0; row < arr2D.length; row++)
		{	
			result[row] = arr2D[row][c];
		}

		return result;
	}

}
