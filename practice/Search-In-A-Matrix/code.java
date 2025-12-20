public class Solution {
    public int solve(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0, j = cols-1; i < rows && j >= 0;)
        { 
            if (B == A[i][j])
            {
                int position = ((i+1) *1009 + (j+1));
                ans = Math.min (ans, position);
                j--;
            }

            else if (B > A[i][j])
            {
                i++;
            }

            else 
            {
                j--;
            }   
            
        }
        if (ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}
