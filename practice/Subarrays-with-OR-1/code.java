public class Solution {
    public int subarraysWithOR1(int[] A) {
        int N = A.length;
        int totalSubArrays = N*(N+1)/2;

        //subarrays with only 0'subarrays
        int zero = 0, zeroSubArray = 0;
        for (int i = 0; i < N; i++)
        {
            if (A[i] == 0)
            {
                //count only consecutive 0's
                zero++;
            }
            //end of consecutive 0's block, compute the subarray and start again
            else 
            {
                // find number of zero subarrays
                zeroSubArray += zero * (zero + 1) /2;
                zero = 0;
            }
        } 
        
        // if ending element is a 0
        zeroSubArray += zero * (zero + 1) /2;

        //Subarrays with atleast one 1 
        return (totalSubArrays - zeroSubArray);

    }
}
