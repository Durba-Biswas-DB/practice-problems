import java.util.*;

public class Solution {
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        return find(A, B, 0);
    }

    private ArrayList<Integer> find(ArrayList<Integer> A, int B, int index) {

        if (index == A.size()) {
            return new ArrayList<>();
        }

        ArrayList<Integer> indices = find(A, B, index + 1);

        if (A.get(index) == B) {
            indices.add(0, index); // maintain increasing order
        }

        return indices;
    }
}
