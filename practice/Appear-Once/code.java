import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xorAll = 0;

        // Step 1: XOR all elements
        for (int x : A) {
            xorAll ^= x;
        }

        // Step 2: Find rightmost set bit
        int rightMostBit = xorAll & (-xorAll);

        int num1 = 0, num2 = 0;

        // Step 3: Divide numbers into two groups
        for (int x : A) {
            if ((x & rightMostBit) != 0) {
                num1 ^= x;
            } else {
                num2 ^= x;
            }
        }

        // Step 4: Store result in ascending order
        ArrayList<Integer> result = new ArrayList<>();
        if (num1 < num2) {
            result.add(num1);
            result.add(num2);
        } else {
            result.add(num2);
            result.add(num1);
        }

        return result;
    }
}
