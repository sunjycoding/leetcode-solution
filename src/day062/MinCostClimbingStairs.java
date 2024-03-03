package day062;

/**
 * 746. Min Cost Climbing Stairs
 *
 * @author created by sunjy on 3/2/24
 */
public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n <= 2) {
            return Math.min(cost[0], cost[1]);
        }

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }

        return Math.min(first, second);
    }

    public static void main(String[] args) {
        int[] cost = new int[]{10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

}
