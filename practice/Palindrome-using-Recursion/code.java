public class Solution {
    public int solve(String A) {
        String Str = A;
        return isPalindrome(A, 0, A.length()-1);

    }

    private int isPalindrome(String Str, int start, int end)
    {
        if (start >= end) return 1;

        if (Str.charAt(start) != Str.charAt(end)) return 0;

        return isPalindrome(Str, start+1, end-1);
    
    }
}

