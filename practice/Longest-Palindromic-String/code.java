public class Solution {
    public String longestPalindrome(String A) {
        if (A == null || A.length() == 0) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < A.length(); i++) {
            // odd length palindrome (center at i)
            int oddLength = expandFromCentre(A, i, i);

            // even length palindrome (center between i & i+1)
            int evenLength = expandFromCentre(A, i, i + 1);

            int len = Math.max(oddLength, evenLength);
            int currLen = end - start + 1;

            if (len > currLen) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            } else if (len == currLen) {
                int newStart = i - (len - 1) / 2;
                if (newStart < start) { // tie-break: prefer earlier start
                    start = newStart;
                    end = i + len / 2;
                }
            }
        }

        return A.substring(start, end + 1);
    }

    private int expandFromCentre(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // palindrome length
    }
}
