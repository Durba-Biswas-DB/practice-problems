public class Solution {
    public long power(int A, int B) {

        if (B == 0) return 1;

        long pow = power(A, B/2);
        if (B % 2 == 0) // even
        {
            return pow * pow;
        }
        else return (pow * pow * A); // odd
    }
}

