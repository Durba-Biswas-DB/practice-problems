public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int p = A[0];

        //sort the array
        Arrays.sort(A);

        for (int i = 0; i < N; i++)
        {
            //duplicate elements
            if (i < N -1 && A[i] == A[i+1]) 
            {
                continue;
            }

            // we have noble element
            if (A[i] == N -i - 1)
            {
                return 1;
            }
            
        }
        return -1;
    }
}
