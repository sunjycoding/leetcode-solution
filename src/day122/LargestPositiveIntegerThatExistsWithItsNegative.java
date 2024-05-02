package day122;

import java.util.HashSet;
import java.util.Set;

/**
 * 2441. Largest Positive Integer That Exists With Its Negative
 *
 * @author created by sunjy on 5/1/24
 */
public class LargestPositiveIntegerThatExistsWithItsNegative {

    public int findMaxK(int[] nums) {
        // Create a set to store all the numbers in the array
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxK = -1;

        // Iterate from 1 to the maximum positive value in the array
        for (int num : set) {
            if (num > 0 && set.contains(-num)) {
                maxK = Math.max(maxK, num);
            }
        }

        return maxK;
    }
}
