public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        long count = 0;
        int mod = 1000000007;

        for (int num : A) {
            int complement = B - num;

            // Add number of pairs formed with previous occurrences of 'complement'
            if (freq.containsKey(complement)) {
                count = (count + freq.get(complement)) % mod;
            }

            // Add current number to map
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return (int) (count % mod);
    }
}

