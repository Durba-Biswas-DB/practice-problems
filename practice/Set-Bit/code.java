public class Solution {
    public int solve(int A, int B) {
        int num = 0;

        //Ath bit
        int maskA = 1 << A;

        //Bth bit
        int maskB = 1 << B;

        //updating num  
        // using OR wont change other bits
        num = 0 | maskA | maskB;

        return num;
    }
}
