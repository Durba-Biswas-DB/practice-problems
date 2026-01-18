public class Solution {
    public void DecThenInc(int A) {

        printRev(A);
        printInc(1, A);
        System.out.println();
    }

    private void printRev(int max)
    {
        if (max == 0) return;
        
        System.out.print(max + " ");
        printRev (max -1);
        
    }

    private void printInc(int curr, int max)
    {
        if (curr > max) 
        {
            return;
        }

        System.out.print(curr + " ");
        printInc(curr +1, max);
        
    }
}


