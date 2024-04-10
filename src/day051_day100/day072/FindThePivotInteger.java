package day051_day100.day072;

/**
 * 2485. Find the Pivot Integer
 *
 * @author created by sunjy on 3/12/24
 */
public class FindThePivotInteger {

    public int pivotInteger(int n) {
        long totalSum = (long) n * (n + 1) / 2;
        long leftSum = 0;

        for (int x = 1; x <= n; x++) {
            leftSum += x;
            // Include x in both sums
            long rightSum = totalSum - leftSum + x;
            if (leftSum == rightSum) {
                return x;
            }
        }

        return -1;
    }

}
