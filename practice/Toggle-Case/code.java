public class Solution {
    public String solve(String A) {
        int len = A.length();
        StringBuilder sb =  new StringBuilder (A);

        for (int i = 0; i < len; i++)
        {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                //toggle to lowercase
                char lower = Character.toLowerCase(ch);
                sb.setCharAt(i, lower);
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                //toggle too uppercase
                char upper = Character.toUpperCase(ch);
                sb.setCharAt(i, upper);
            }

        }
        return sb.toString();
    }
}
