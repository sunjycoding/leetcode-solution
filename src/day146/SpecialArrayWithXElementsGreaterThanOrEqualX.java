package day146;

import java.util.Arrays;

/**
 * 1608. Special Array With X Elements Greater Than or Equal X
 *
 * @author created by sunjy on 5/26/24
 */
public class SpecialArrayWithXElementsGreaterThanOrEqualX {

    public int specialArray(int[] nums) {
        int left = 0, right = nums.length, mid;

        // Sort the array to make it easier to count elements >= x
        Arrays.sort(nums);

        while (left <= right) {
            mid = left + (right - left) / 2; // Mid represents the potential 'x'
            int geq = greaterEqual(nums, mid);

            if (geq == mid) {
                return mid;
            } else if (geq > mid) {
                left = mid + 1;  // Increase 'x' because we need fewer numbers that are >= x
            } else {
                right = mid - 1; // Decrease 'x' because we need more numbers that are >= x
            }
        }

        return -1; // If no special value of x found
    }

    // Helper function to find how many numbers are >= x using binary search on the sorted array
    private int greaterEqual(int[] nums, int x) {
        int low = 0, high = nums.length - 1, mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums.length - low;
    }

}
