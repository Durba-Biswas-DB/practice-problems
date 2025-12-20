public class Solution {
    public int firstMissingPositive(int[] A) {
        int N = A.length;
        int j = 1, i = 0;
        Arrays.sort(A);

        while (i < N)
        {
            if (A[i] < 1)
            {
                i++;
                continue;
            }
            
            while (i+1 < N && A[i] == A[i+1])
            {
                i++;
            }
            if (A[i] == j)
            {
                j++;
                
            }
            i++;
        }

        return j;
    }
}
