public class Solution {
    public int cpFact(int A, int B) {

        int mod_max = 1;

        while (gcd(A, B) != 1)
        {
            A = A/ gcd (A, B);
        }

        return A;

    }
    private int gcd(int A, int B)
    {
        if (B == 0) return A;
        else return gcd(B, A % B);
    }
}

