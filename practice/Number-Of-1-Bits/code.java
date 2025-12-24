public class Solution {
    public int numSetBits(int A) {
        int one = 0;

        // remove the rightmost set numSetBit
        while (A > 0)
        {
            A = A & (A - 1);
            one++;
        }
        return one;
    }
}
