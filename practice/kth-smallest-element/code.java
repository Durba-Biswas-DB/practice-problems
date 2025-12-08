public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int N = A.length;

        //find the Bth smallest element
        for (int i = 0; i < B; i++)
        {
            int min_index = i; // find min element in the range i->N-1

            for (int j = i+1; j < N; j++)
            {
                if (A[j] < A[min_index])
                {
                    min_index = j; //updated min_index
                }
            }

            //once min element is found, swap it with i 
            int temp = A[i];
            A[i] = A[min_index];
            A[min_index] = temp;
        }
         
         return A[B-1]; 
    }
}
