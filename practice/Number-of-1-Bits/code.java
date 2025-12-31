public class Solution {
    public int numSetBits(int A) {
        int one = 0;
        while (A > 0)
        {
            if ((A & 1) == 1)
            {
                one++;
            }
            A = A >> 1;
        }

        return one;
    }
}
