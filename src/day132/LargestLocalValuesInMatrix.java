package day132;

/**
 * 2373. Largest Local Values in a Matrix
 *
 * @author created by sunjy on 5/11/24
 */
public class LargestLocalValuesInMatrix {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        max = Math.max(max, grid[r][c]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }

        return maxLocal;
    }

}
