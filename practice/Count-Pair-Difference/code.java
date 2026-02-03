public class Solution {
    public int solve(int[] A, int B) {

        HashMap <Integer, Integer> freq = new HashMap<>();

        for (int num: A)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int key: freq.keySet())
        {
            int val = key + B;
            int freqKey = freq.get(key);
            int freqVal = freq.getOrDefault(val, 0);

            if (val == key)
            {

                if (freq.get(key) > 1)
                {
                    count += freqKey * (freqKey - 1) /2 % 100000007;
                }
                
            }
            if (freq.containsKey(val))
            {
                count += (freqKey * freqVal) % 1000000007;
            }
        }
        return (int) count % 1000000007;

    }
}
