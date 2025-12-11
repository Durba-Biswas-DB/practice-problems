public class Solution {
    public String solve(String A) {
        int len = A.length();
        StringBuilder sb = new StringBuilder(A);

        //concatenate the string with itself
        sb.append(A);
        
        // delete uppercase
        for (int i = 0; i < sb.length(); i++)
        {
            char ch = sb.charAt(i);
            // check if uppercase
            if (ch >= 'A' && ch <= 'Z')
            {
                //delete character
                sb.delete(i, i+1);
                i--; // because character is deleted, hence index goes back
            }
        }


        for (int i = 0; i < sb.length(); i++)
        {
            char ch = sb.charAt(i);
            //check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                //replace vowels with #
                sb.setCharAt(i, '#');
            }
        }

        //convert back to string then return
        return sb.toString();  

    }
}
