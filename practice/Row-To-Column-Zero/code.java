public class Solution {
    public int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // check if first row has zero
        for (int j = 0; j < cols; j++) {
            if (A[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // check if first col has zero
        for (int i = 0; i < rows; i++) {
            if (A[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // mark zeros in first row and col
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (A[i][j] == 0) {
                    A[i][0] = 0;
                    A[0][j] = 0;
                }
            }
        }

        // update cells based on marks
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (A[i][0] == 0 || A[0][j] == 0) {
                    A[i][j] = 0;
                }
            }
        }

        // zero first row if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                A[0][j] = 0;
            }
        }

        // zero first col if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                A[i][0] = 0;
            }
        }

        return A;
    }
}
