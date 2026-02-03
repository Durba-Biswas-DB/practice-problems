public class Solution {
    public int solve(int[] A) {

        HashMap <Integer, Integer> freq = new HashMap<>();

        for (int num: A)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int key: freq.keySet())
        {
            int val = freq.get(key);
            if (val == 1) count++;
        }

        return count;
    }
}
