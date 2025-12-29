public class Solution {
    public int solve(int A, int B) {
        int toggled = 0;
        if (((A >> B) & 1) == 1)
        {
            return A ^ (1 << B);
        }

        else return A;
    }
}
 
