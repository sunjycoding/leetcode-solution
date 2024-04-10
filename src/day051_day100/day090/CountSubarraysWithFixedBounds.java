package day051_day100.day090;

/**
 * 2444. Count Subarrays With Fixed Bounds
 *
 * @author created by sunjy on 3/30/24
 */
public class CountSubarraysWithFixedBounds {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int lastMin = -1, lastMax = -1, leftBound = -1;

        for (int right = 0; right < nums.length; right++) {
            // If the current number is out of the [minK, maxK] range, reset the left bound
            if (nums[right] < minK || nums[right] > maxK) {
                leftBound = right;
            }

            // Update the last positions of minK and maxK
            if (nums[right] == minK) {
                lastMin = right;
            }
            if (nums[right] == maxK) {
                lastMax = right;
            }

            // If both minK and maxK are seen at least once,
            // count the subarrays ending at the current position
            if (lastMin != -1 && lastMax != -1) {
                count += Math.max(0, Math.min(lastMin, lastMax) - leftBound);
            }
        }

        return count;
    }

}
