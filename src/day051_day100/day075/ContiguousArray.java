package day051_day100.day075;

import java.util.HashMap;
import java.util.Map;

/**
 * 525. Contiguous Array
 *
 * @author created by sunjy on 3/15/24
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        // This hashmap will store the first index at which a particular cumulative sum is encountered.
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize with sum = 0 at index -1 for the case where the balanced subarray starts from index 0.
        map.put(0, -1);
        int maxLength = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Increment or decrement count based on the value of nums[i].
            count += (nums[i] == 1) ? 1 : -1;

            // If this count has been seen before, we have found a new subarray with equal number of 0s and 1s.
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // Otherwise, store this count with the current index.
                map.put(count, i);
            }
        }
        return maxLength;
    }

}
