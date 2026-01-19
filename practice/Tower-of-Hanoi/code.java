import java.util.*;

public class Solution {
    public int[][] towerOfHanoi(int A) {
        List<int[]> moves = new ArrayList<>();
        solve(A, 1, 3, 2, moves); // from=1, to=3, aux=2

        // Convert List<int[]> to int[][]
        int[][] result = new int[moves.size()][3];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(i);
        }
        return result;
    }

    private void solve(int n, int from, int to, int aux, List<int[]> moves) {
        if (n == 0) return;

        // Step 1: Move n-1 disks from "from" to "aux"
        solve(n - 1, from, aux, to, moves);

        // Step 2: Move disk n from "from" to "to"
        moves.add(new int[]{n, from, to});

        // Step 3: Move n-1 disks from "aux" to "to"
        solve(n - 1, aux, to, from, moves);
    }
}

