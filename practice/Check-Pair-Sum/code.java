public class Solution {
    public int solve(int A, int[] B) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < B.length; i++)
        {
            freq.put(B[i], freq.getOrDefault(B[i], 0) + 1);
        }

        
        // checking pairs
        for (int key: freq.keySet()) 
        {
            int result = A - key;

            if (result == key) // i != j, freq shold be more than 1
            {
                if (freq.get(key) > 1) return 1;
            }

            else if (freq.containsKey (result)) return 1;
        }

        return 0;
    }
}
