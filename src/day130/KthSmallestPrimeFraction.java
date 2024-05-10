package day130;

/**
 * 786. K-th Smallest Prime Fraction
 *
 * @author created by sunjy on 5/9/24
 */
public class KthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double low = 0.0;
        double high = 1.0;
        int n = arr.length;
        int[] answer = new int[2];

        while (low < high) {
            double mid = (low + high) / 2;
            int total = 0;
            int j = 1;
            int maxNumerator = 0;
            int maxDenominator = 1;

            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }
                total += n - j;
                if (j < n && arr[i] * maxDenominator > maxNumerator * arr[j]) {
                    maxNumerator = arr[i];
                    maxDenominator = arr[j];
                }
            }

            if (total == k) {
                answer[0] = maxNumerator;
                answer[1] = maxDenominator;
                break;
            } else if (total < k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return answer;
    }

}
