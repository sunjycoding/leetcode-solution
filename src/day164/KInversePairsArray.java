package day164;

/**
 * 629. K Inverse Pairs Array
 *
 * @author created by sunjy on 6/13/24
 */
public class KInversePairsArray {

    public int kInversePairs(int n, int k) {
        int MOD = 1000000007;
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            long cumulative = 0;
            for (int j = 0; j <= k; j++) {
                cumulative += dp[i - 1][j];
                if (j >= i) {
                    cumulative -= dp[i - 1][j - i];
                }
                dp[i][j] = (int) (cumulative % MOD);
                if (cumulative < 0) {
                    cumulative += MOD;
                }
            }
        }
        return dp[n][k];
    }

}
