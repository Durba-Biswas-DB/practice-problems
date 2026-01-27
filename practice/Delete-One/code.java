public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];

        // Step 1: Build prefix GCD
        prefix[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefix[i] = gcd(prefix[i - 1], A[i]);
        }

        // Step 2: Build suffix GCD
        suffix[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], A[i]);
        }

        // Step 3: Check GCD after removing each element
        int maxGCD = 0;
        for (int i = 0; i < N; i++) {
            int currentGCD;
            if (i == 0) currentGCD = suffix[1];
            else if (i == N - 1) currentGCD = prefix[N - 2];
            else currentGCD = gcd(prefix[i - 1], suffix[i + 1]);

            maxGCD = Math.max(maxGCD, currentGCD);
        }

        return maxGCD;
    }

    // Standard recursive GCD function
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
