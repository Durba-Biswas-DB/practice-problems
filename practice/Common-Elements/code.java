public class Solution {

    public int[] solve(int[] A, int[] B) {

        HashMap <Integer, Integer> mapA = new HashMap<>();
        HashMap <Integer, Integer> mapB = new HashMap<>();
        ArrayList <Integer> common = new ArrayList<>();

        for (int num: A)
        {
            mapA.put(num, mapA.getOrDefault(num, 0) + 1);
        }

        for (int num: B)
        {
            mapB.put(num, mapB.getOrDefault(num, 0) + 1);
        }

        for (int key: mapA.keySet())
        {
            if (mapB.containsKey(key))
            {
                //store min value of each common key
                int commonFreq = Math.min(mapA.get(key), mapB.get(key));

                // add them to the List common
                for (int i = 0; i < commonFreq; i++)
                {
                    common.add(key);
                }
            }
        }

        // convert and return Set as Array
        int result[] = new int [common.size()];
        int i = 0;
        for (int num: common)
        {
            result[i++] = num;
        }

        return result;
        
    }
}
