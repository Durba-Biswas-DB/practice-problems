public class Solution {
    public int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        // square matrix
        if (rows == cols)
        {
            for (int i = 0; i < rows; i++)
            {
                for (int j = i+1; j < rows; j++)
                {
                    //swap elements
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        return A;
        }

        // rectangular matrix
        int [][] result = new int [cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
