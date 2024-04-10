package day051_day100.day089;

/**
 * 992. Subarrays with K Different Integers
 *
 * @author created by sunjy on 3/29/24
 */
public class SubarraysWithKDifferentIntegers {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int left = 0, res = 0;
        int[] count = new int[nums.length + 1]; // Assuming numbers in nums are 1-indexed and not larger than nums.length
        int unique = 0; // To track the number of unique numbers in the current window

        for (int right = 0; right < nums.length; right++) {
            if (count[nums[right]] == 0) {
                unique++; // Found a new unique number
            }
            count[nums[right]]++;

            while (unique > k) {
                count[nums[left]]--; // Move left pointer to reduce window size
                if (count[nums[left]] == 0) {
                    unique--; // If count goes to zero, we lost a unique number
                }
                left++;
            }

            // At this point, we have a window with at most k unique numbers
            // All subarrays ending with 'right' and starting from any index <= 'left' are valid
            res += right - left + 1;
        }

        return res;
    }

}
