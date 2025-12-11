public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int sum = 0;

        if (rows == cols)
        {
            for (int i = 0; i < rows; i++)
            {
                sum += A[i][i];
            }
            
        }
        return sum;
    }
}
