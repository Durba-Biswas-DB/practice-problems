public class Solution {
    public void PrintArray(ArrayList<Integer> A) {

        if (A.size() == 0) return;

        printArr(A, 0);
        
        System.out.println();
    }

    private void printArr(ArrayList<Integer> A, int i)
    {
        if (i >= A.size()) return;

        System.out.print(A.get(i) + " ");
        printArr(A, i+1);

    }
}

