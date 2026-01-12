public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int mod = 1000000007;
        long result = 0;

        long totalSubArrays = (long) N * (N + 1) / 2;

        for (int bit = 0; bit < 32; bit++) {
            long zeroSubArrays = 0;
            long zeroCount = 0;

            for (int i = 0; i < N; i++) {
                if ((A[i] & (1 << bit)) == 0) {
                    zeroCount++;
                } else {
                    zeroSubArrays += zeroCount * (zeroCount + 1) / 2;
                    zeroCount = 0;
                }
            }
            // handle trailing zeros
            zeroSubArrays += zeroCount * (zeroCount + 1) / 2;

            // (a - b) % mod, the result can be negative if a < b
            long bitContribution = ((totalSubArrays - zeroSubArrays) % mod) * ((1L << bit) % mod) % mod;
            result = (result + bitContribution) % mod;
        }

        return (int) result;
    }
}

