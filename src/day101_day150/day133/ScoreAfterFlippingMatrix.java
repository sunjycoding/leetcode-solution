package day101_day150.day133;

/**
 * 861. Score After Flipping Matrix
 *
 * @author created by sunjy on 5/12/24
 */
public class ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1: Ensure the first column has all 1s by toggling rows if necessary
        for (int r = 0; r < rows; r++) {
            if (grid[r][0] == 0) {
                toggleRow(grid, r);
            }
        }

        // Step 2: For each column, count 0s and 1s and toggle if it increases the score
        for (int c = 1; c < cols; c++) {
            int count1 = 0;
            for (int[] ints : grid) {
                if (ints[c] == 1) {
                    count1++;
                }
            }
            int count0 = rows - count1;
            if (count0 > count1) {
                toggleColumn(grid, c);
            }
        }

        // Step 3: Calculate the total score
        int score = 0;
        for (int[] ints : grid) {
            int rowValue = 0;
            for (int c = 0; c < cols; c++) {
                rowValue = rowValue * 2 + ints[c];
            }
            score += rowValue;
        }

        return score;
    }

    private void toggleRow(int[][] grid, int row) {
        for (int c = 0; c < grid[0].length; c++) {
            grid[row][c] = 1 - grid[row][c];
        }
    }

    private void toggleColumn(int[][] grid, int col) {
        for (int r = 0; r < grid.length; r++) {
            grid[r][col] = 1 - grid[r][col];
        }
    }

}
