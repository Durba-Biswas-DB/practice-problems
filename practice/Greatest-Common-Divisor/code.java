public class Solution {
    public int gcd(int A, int B) {

        if (A == 0) return B;
        if (B == 0) return A;
        
        B = B % A;
        return gcd(B, A);
    }
}
