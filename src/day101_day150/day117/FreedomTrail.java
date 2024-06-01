package day101_day150.day117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 514. Freedom Trail
 *
 * @author created by sunjy on 4/26/24
 */
public class FreedomTrail {

    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length();
        List<Integer>[] pos = new List[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            pos[ring.charAt(i) - 'a'].add(i);
        }

        // dp[i][j] -> minimum steps to align key.charAt(j) at index i of ring
        int[][] dp = new int[n][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        // Start at index 0 with 0 steps
        dp[0][0] = 0;

        for (int j = 0; j < m; j++) {
            char ch = key.charAt(j);
            for (int index : pos[ch - 'a']) {
                // For each position of the current key character in the ring
                if (j == 0) {
                    // Base case for the first character in the key
                    dp[index][j + 1] = Math.min(dp[index][j + 1], Math.min(index, n - index) + 1);
                } else {
                    for (int k = 0; k < n; k++) {
                        // Transition from all ring positions that have been reached after spelling out key[0..j-1]
                        if (dp[k][j] < Integer.MAX_VALUE) {
                            int steps = Math.min(Math.abs(k - index), n - Math.abs(k - index)) + 1;
                            dp[index][j + 1] = Math.min(dp[index][j + 1], dp[k][j] + steps);
                        }
                    }
                }
            }
        }

        // Find the minimum steps required to spell out the entire key
        int minSteps = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minSteps = Math.min(minSteps, dp[i][m]);
        }

        return minSteps;
    }

}
