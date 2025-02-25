package codeSignal;
import java.util.ArrayList;
import java.util.List;
/*The find secondary diagonal class  finds the maximum and 
 * minimum in the secondary diagonal*/
public class FindMinandMaxinSecondaryDiagonal {
	
	public static List<Integer>solution(int [][]grid)
	{
		//checking if the grid is empty
		if(grid == null || grid[0].length == 0 || grid.length == 0)
		{
			List<Integer>result = new ArrayList<>();
			result.add(null);
			result.add(null);
			return result;
		}
		//initialize the minimum, maximum and n
		int n = grid.length;
		Integer minimum = grid[0][n-1];
		Integer maximum = grid[0][n-1];
		//loop through the grid
		for (int i = 1; i < n; i++)
		{
			//find the current number
			int currentNumber = grid[i][n-1-i];
			//check if the current number is less than minimum
			if(currentNumber < minimum)
			{
				minimum = currentNumber;
			}
			//checking if current Number is great than maximum
			if (currentNumber > maximum)
			{
				maximum = currentNumber;
			}
		}
		List<Integer>result = new ArrayList<>();
		result.add(minimum);
		result.add(maximum);
		return result;
	}

	public static void main(String[] args) {
		int matrix[][] = {{-5,-1,-9,-11}, {-2,-4,-8,-10},{-13,-3,-6,-7}, {-15, -14, -12, -16}};
		
        System.out.print(FindMinandMaxinSecondaryDiagonal.solution(matrix));
	}

}
