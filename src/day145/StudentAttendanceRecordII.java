package day145;

/**
 * 552. Student Attendance Record II
 *
 * @author created by sunjy on 5/25/24
 */
public class StudentAttendanceRecordII {

    public int checkRecord(int n) {
        int MOD = 1000000007;
        long[][][] dp = new long[n + 1][2][3];

        // Base case: an empty string is a valid sequence
        dp[0][0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < 2; a++) {
                for (int l = 0; l < 3; l++) {
                    // Add 'P'
                    dp[i][a][0] = (dp[i][a][0] + dp[i - 1][a][l]) % MOD;

                    // Add 'A' (only if there hasn't been an 'A' yet)
                    if (a == 1) {
                        dp[i][1][0] = (dp[i][1][0] + dp[i - 1][0][l]) % MOD;
                    }

                    // Add 'L' (only if it doesn't result in 3 consecutive 'L's)
                    if (l < 2) {
                        dp[i][a][l + 1] = (dp[i][a][l + 1] + dp[i - 1][a][l]) % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (int a = 0; a < 2; a++) {
            for (int l = 0; l < 3; l++) {
                result = (result + dp[n][a][l]) % MOD;
            }
        }

        return (int) result;
    }
}
