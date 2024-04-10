package day051_day100.day073;

import java.util.HashMap;
import java.util.Map;

/**
 * 930. Binary Subarrays With Sum
 *
 * @author created by sunjy on 3/13/24
 */
public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        // Map to store the frequency of each prefix sum
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        // Initialize count of subarrays and the cumulative sum
        int count = 0;
        int sum = 0;
        // Add an initial prefix sum of 0 to handle cases where a subarray starting from index 0 has a sum of goal
        prefixSumCount.put(0, 1);

        for (int num : nums) {
            // Update the cumulative sum
            sum += num;
            // If there's a previous sum such that current_sum - previous_sum = goal, add its frequency to count
            count += prefixSumCount.getOrDefault(sum - goal, 0);
            // Update the frequency of the current sum
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

}
