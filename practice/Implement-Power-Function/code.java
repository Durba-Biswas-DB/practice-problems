// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
public class Solution {
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        
        if (A == 0) return 0;
        if (B == 0) return 1;

        A = A % C; //to handle -ve values

        long result = pow(A, B/2, C);

        if (B % 2 == 0)
        {
            result = ((result * result) % C);
        }

        else result = ((((result * result) % C) * A) % C);

        return (int)((result + C) % C);
    }
}

