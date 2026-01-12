public class Solution {
    public int findMinXor(int[] A) {
        int N = A.length;
        int XORmin = Integer.MAX_VALUE;

        // sort to get the elements closer to each other
        Arrays.sort(A);

        for (int i = 0; i < N-1; i++)
        {
            int XOR = A[i] ^ A[i+1];
            XORmin = Math.min(XORmin, XOR);
        }
        return XORmin;
    }
}
