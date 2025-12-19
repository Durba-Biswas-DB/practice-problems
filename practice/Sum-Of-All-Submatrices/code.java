public class Solution {
    public int solve(int[][] A) {
        int N = A.length;
        int total = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                int topleft = i+1;
                int bottomleft = j+1;
                int topright = N-i;
                int bottomright = N-j;

                int contribution = A[i][j] * topleft * topright * bottomleft * bottomright;
                total += contribution;
            }
        }
        return total;
    }
}
