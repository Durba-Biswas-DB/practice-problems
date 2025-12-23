public class Solution {
    public int[] nextPermutation(int[] A) {
        int N = A.length;
        int pivot = -1;

        for (int i = N-2; i >= 0; i--)
        {
            if (A[i] < A[i+1])
            {
                pivot = i;

                break;
            }
        }

        //edge case -> if it is already in dec order 
        // return the asc ordered array
        if (pivot == -1)
        {
            int left = 0, right = N-1;
            while (left < right)
            {
                swap(A, left, right);
                left++;
                right--;
            }
            return A;
        }

        int index2 = -1;
        for (int j = N-1; j >= pivot+1; j--)
        {
            if (A[j] > A[pivot]) 
            {
                index2 = j;
                break;
            }
        }

        //swap
        swap(A, pivot, index2);
        
        // reverse suffix after new pivot
        int start = pivot+1, end = N-1;
        while (start < end)
        {
            //swap
            swap(A, start, end);

            start++;
            end--;
        }
        return A;

    }

    public void swap(int A[], int n, int m)
    {
        int temp = A[n];
        A[n] = A[m];
        A[m] = temp; 
    }
}
