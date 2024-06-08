package day158;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 *
 * @author created by sunjy on 6/7/24
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        // HashMap to store the first occurrence of each sum % k value
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize with sum % k = 0 at index -1 for edge cases
        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If k is not zero, take modulo k
            if (k != 0) {
                sum = sum % k;
            }
            // If sum % k is already seen
            if (map.containsKey(sum)) {
                // Check if the subarray length is at least 2
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of this sum % k
                map.put(sum, i);
            }
        }
        return false;
    }

}
