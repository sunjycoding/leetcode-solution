package day051_day100.day087;

import java.util.HashMap;

/**
 * 2958. Length of Longest Subarray With at Most K Frequency
 *
 * @author created by sunjy on 3/27/24
 */
public class LengthOfLongestSubarrayWithAtMostKFrequency {

    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, maxLength = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            // Add current element to the frequency map
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            // Check if the current subarray is good
            while (freqMap.get(nums[right]) > k) {
                // If not, shrink the window from the left
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }

            // Update the maxLength if a longer good subarray is found
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
