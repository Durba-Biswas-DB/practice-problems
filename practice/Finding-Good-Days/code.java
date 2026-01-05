public class Solution {
    public int solve(int A) {

        int stash = 0;

        while (A > 0)
        {
            
            if ((A & 1) == 1)
            {
                stash++;
            }
            A = A >> 1;
            
        }
        return stash;
    }
}
