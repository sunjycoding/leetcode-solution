package day051_day100.day064;

/**
 * 997. Find the Town Judge
 *
 * @author created by sunjy on 3/4/24
 */
public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        int[] trustCounts = new int[n + 1];

        for (int[] relation : trust) {
            // Decrement for the person who trusts another
            trustCounts[relation[0]]--;
            // Increment for the person who is trusted
            trustCounts[relation[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            // The judge would be trusted by n-1 people and trust no one
            if (trustCounts[i] == n - 1) {
                return i;
            }
        }

        // If no judge found
        return -1;
    }

}
