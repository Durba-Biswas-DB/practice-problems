public class Solution {
    public int solve(int A) {
        // Find the position of the highest set bit in A
        int HBits = 31;
        
        for (HBits = 31; HBits >= 0; HBits--)
        {
            if ((A & (1 << HBits)) != 0) break;
        }

        // X: largest number smaller than A with no overlapping bits
        int mask = (1 << HBits) - 1; // all 1s below highest bit
        int X = mask & (~A); // keep only bits that are 0 in A

        // Y: smallest number greater than A with no overlapping bits
        int Y = 1 << (HBits + 1);

        // XOR of X and Y
        return X ^ Y;
    }
}
