public class Solution {
    public int[] solve(int A, int[][] B) {
        int [] result = new int [A];

        for (int [] donations : B)
        {
            int L = donations[0];
            int R = donations[1];
            int P = donations[2];

            // adding P from L-1 as L is 1-indexed
            result [L-1] += P;

            // stop adding at R
            if (R < A)
            {
                result [R] -= P;
            }
        }
        
        // prefix sum to get the total donation 
        for (int i = 1; i < A; i++)
        {
            result [i] += result [i-1];
        }

        return result;
    }
}
