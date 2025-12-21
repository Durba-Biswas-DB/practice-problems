public class Solution {
    public int[][] generateMatrix(int A) {
        int [][] result = new int [A][A];
        
        int top = 0, bottom = A-1;
        int left = 0, right = A-1;
        int num = 1;

        while (top <= bottom && left <= right)
        {
            // right top row
            for (int j = left; j <= right; j++)
            {
                result [top][j] = num++;
            }
            top++; // move to next row

            // down right column
            for (int i = top; i <= bottom; i++)
            {
                result[i][right] = num++;
            }
            right--; // move left

                        if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result[bottom][j] = num++;
                }
                bottom--;  // move boundary up
            }

            // Fill left column from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++;  // move boundary right
            }
        }

        return result;
    }
}
