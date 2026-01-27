public class Solution {
    public int solve(int[] A, int B) {
        long[] rem = new long[B];
        long mod = 1000000007;

        // Count remainders
        for (int i = 0; i < A.length; i++) {
            rem[A[i] % B]++;
        }

        long count = 0;

        // Handle remainder 0 separately
        count = (rem[0] * (rem[0] - 1) / 2) % mod;

        // Handle the case when B is even
        if (B % 2 == 0) {
            count = (count + rem[B/2] * (rem[B/2] - 1) / 2) % mod;
        }

        // Handle other remainders
        for (int i = 1; i < (B + 1) / 2; i++) {
            count = (count + rem[i] * rem[B-i]) % mod;
        }

        return (int)count;
    }
}
