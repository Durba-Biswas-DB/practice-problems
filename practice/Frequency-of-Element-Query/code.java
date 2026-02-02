public class Solution {
    public int[] solve(int[] A, int[] B) {
        HashMap <Integer, Integer> mapA = new HashMap<>();
        int result[] = new int [B.length];

        // freq of A
        for (int num: A)
        {
            mapA.put(num, mapA.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < B.length; i++)
        {
            if (mapA.containsKey(B[i]))
            {
                int val = mapA.get(B[i]);
                result[i] = val;
            }
            else result[i] = 0;
        }

        return result;
    }
}
