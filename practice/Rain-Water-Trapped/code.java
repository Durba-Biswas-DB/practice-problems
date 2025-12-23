public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int N = A.length;
        int L = 0, R = N-1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (L <= R)
        {
            if (A[L] <= A[R])
            {
                if (A[L] >= leftMax) leftMax = A[L];
                else 
                {
                    water += leftMax - A[L];
                }
                L++;
            }
            else 
            {
                if (A[R] >= rightMax) rightMax = A[R];
                else
                {
                    water += rightMax - A[R];
                }
                R--;
            }
        }

        return water;
    }
}
