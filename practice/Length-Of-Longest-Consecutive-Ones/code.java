public class Solution {
    public int solve(String A) {
        int len = A.length();
        int total_ones = 0;

        for (int i = 0; i < len; i++)
        {
            if (A.charAt(i) == '1')
            {
                total_ones++;
            }
        }

        // if no 0
        if (total_ones == len)
        {
            return total_ones;
        }

        //check each zero 
        int maxLen = 0;
        for (int i = 0; i < len; i++)
        {
            if (A.charAt(i) == '0')
            {
                //count 1's on left
                int left = 0;
                int j = i-1;
                while (j >= 0 && A.charAt(j) == '1')
                {
                    left++; //keep counting until you find 0
                    j--; //moves left
                }

                //count 1's on right
                int right = 0;
                j = i+1;
                while (j < len && A.charAt(j) == '1')
                {
                    right++;
                    j++; //moves right
                }

                int curr;
                //check for an extra 1 to swap with a 0
                if (total_ones > left+right)
                {
                    curr = left + right + 1;
                }                

                else 
                {
                    curr = left + right;
                }

                maxLen = Math.max(maxLen, curr);
            }
        }
        return maxLen;
        
    }
}
