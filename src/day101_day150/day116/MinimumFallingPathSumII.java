package day101_day150.day116;

/**
 * 1289. Minimum Falling Path Sum II
 *
 * @author created by sunjy on 4/25/24
 */
public class MinimumFallingPathSumII {

    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        if (n == 1) {
            return grid[0][0];
        }

        int[][] dp = new int[n][n];

        // Initialize the first row of dp
        System.arraycopy(grid[0], 0, dp[0], 0, n);

        // Fill the dp array
        for (int i = 1; i < n; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            // Find the first and second minimum values in the previous row
            for (int j = 0; j < n; j++) {
                if (dp[i - 1][j] < min1) {
                    min2 = min1;
                    min1 = dp[i - 1][j];
                } else if (dp[i - 1][j] < min2) {
                    min2 = dp[i - 1][j];
                }
            }

            for (int j = 0; j < n; j++) {
                // If the current dp[i-1][j] is the minimum, use the second minimum
                if (dp[i - 1][j] == min1) {
                    dp[i][j] = grid[i][j] + min2;
                } else {
                    dp[i][j] = grid[i][j] + min1;
                }
            }
        }

        // Find the minimum value in the last row of dp
        int minPathSum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minPathSum = Math.min(minPathSum, dp[n - 1][j]);
        }

        return minPathSum;
    }

}
