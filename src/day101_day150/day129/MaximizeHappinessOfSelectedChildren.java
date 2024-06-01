package day101_day150.day129;

import java.util.Arrays;

/**
 * 3075. Maximize Happiness of Selected Children
 *
 * @author created by sunjy on 5/8/24
 */
public class MaximizeHappinessOfSelectedChildren {

    public long maximumHappinessSum(int[] happiness, int k) {
        // Sort the happiness values in descending order
        Arrays.sort(happiness);
        int n = happiness.length;
        long sum = 0;
        int decrement = 0;

        // Select k children from the sorted happiness array
        for (int i = n - 1; i >= n - k; i--) {
            // Calculate the adjusted happiness value after applying the decrement
            int adjustedHappiness = Math.max(happiness[i] - decrement, 0);
            // Add the adjusted happiness to the sum
            sum += adjustedHappiness;
            // Increment the decrement value for the next selection
            decrement++;
        }

        return sum;
    }

}
