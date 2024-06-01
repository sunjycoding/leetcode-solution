package day101_day150.day134;

/**
 * 1219. Path with Maximum Gold
 *
 * @author created by sunjy on 5/13/24
 */
public class PathWithMaximumGold {

    // Directions array to simplify moving in the grid
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    private int dfs(int[][] grid, int row, int col) {
        int currentGold = grid[row][col];
        // Mark this cell as visited by setting it to 0
        grid[row][col] = 0;
        int maxGold = 0;

        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0], newCol = col + dir[1];
            if (isInGrid(grid, newRow, newCol) && grid[newRow][newCol] != 0) {
                maxGold = Math.max(maxGold, dfs(grid, newRow, newCol));
            }
        }

        // Unmark this cell as visited by restoring its original gold value
        grid[row][col] = currentGold;
        return currentGold + maxGold;
    }

    // Helper method to check if a cell is within the grid bounds
    private boolean isInGrid(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }

}
