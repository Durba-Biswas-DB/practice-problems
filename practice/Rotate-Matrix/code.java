public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        
        //find the tranpose
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //reverse the elements in each row
        for (int i = 0; i < n; i++)
        {
            int left = 0, right = n-1;
            while (left < right)
            {
                int swap = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = swap;
                left++;
                right--;
            }
        }
        //print the array
        return A;
    }
}
