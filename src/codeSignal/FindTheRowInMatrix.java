package codeSignal;
/*The program finds the next row in the matrix equal to the target*/

public class FindTheRowInMatrix {
	public static Integer findRowWithTarget(int[][]matrix, int target)
	{
		int n = matrix.length;
		int m = matrix[0].length;
		int row = 0;
		int col = m -1;
		while (row < n && col >= 0)
		{
			if (matrix[row][col] == target)
			{
				return row;
			} else if (matrix[row][col] > target)
			{
				col --;
			}else
			{
				row ++;
			}
		}
		return null;
	}
	public static void main(String[] args) {
	//matrix
		int[][]matrix = {{1,4,7,11}, {2,5,8,12}, {3,6,9,16}};
		int target = 9;
		int answer = FindTheRowInMatrix.findRowWithTarget(matrix, target);
		System.out.println(answer);
		

	}

}
