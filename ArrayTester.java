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
		System.out.println("arr2D.length = " + arr2D.length);
		System.out.println("arr2D[0].length = " + arr2D[0].length);
		int[] result = new int[arr2D.length];
		for (int row = 0; row < arr2D.length; row++)
		{
			System.out.println("row " + row + ": " + Arrays.toString(arr2D[row]));
			result[row] = arr2D[row][c];
		}

		return result;
	}

}
