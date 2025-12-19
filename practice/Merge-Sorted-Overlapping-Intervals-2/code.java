public class Solution {
    public int[][] solve(int[][] A) {
        int N = A.length;
        // sort the array based on asc order of starting point
        Arrays.sort(A, (a,b) -> Integer.compare (a[0], b[0]));

        int result [][] = new int [N][2];
        int index = 0;

        //adding the first interval
        result [0][0] = A[0][0];
        result [0][1] = A[0][1];

        // check and merge
        for (int i = 1; i < N; i++)
        {
            int start = A[i][0];
            int end = A[i][1];

            int lastEnd = result[index][1];

            if (start <= lastEnd)
            {
                //merge them
                result [index][1] = Math.max (lastEnd, end);
            }

            else 
            {
                //move index and insert new interval
                index++;
                result [index][0] = start;
                result [index][1] = end;
            }

        }

        //trim result to remove extra spaces
        int [][] output = new int[index +1][2];
        for (int i = 0; i <= index; i++)
        {
            output[i][0] = result[i][0];
            output[i][1] = result[i][1];
        }

        return output;
    }
}
