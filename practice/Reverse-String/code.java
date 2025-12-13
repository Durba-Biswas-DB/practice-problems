public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();

        
        //trim extra spaces in the beginning and split the words
        String [] words = A.trim().split(" ");
        int len = words.length;

        for (int i = len-1; i >= 0; i--)
        {
            sb.append(words[i]);
            if(i != 0)
            {
                sb.append(" "); // makes sure spaces are not added at the end
            }
        }
        return sb.toString();
    }
}
