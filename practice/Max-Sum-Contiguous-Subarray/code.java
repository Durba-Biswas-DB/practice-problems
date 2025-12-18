public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < N; i++)
        {
            sum += A[i];
            if (sum > maxsum) maxsum = sum;

            if (sum < 0) sum = 0;
        }

        return maxsum;
    }
}
