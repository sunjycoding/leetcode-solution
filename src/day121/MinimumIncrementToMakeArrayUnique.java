package day121;

import java.util.Arrays;

/**
 * 945. Minimum Increment to Make Array Unique
 *
 * @author created by sunjy on 4/30/24
 */
public class MinimumIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            // If the current element is less than or equal to the previous element
            if (nums[i] <= nums[i - 1]) {
                // Increment the current element to make it unique
                int diff = nums[i - 1] - nums[i] + 1;
                nums[i] += diff;
                moves += diff;
            }
        }

        return moves;
    }

}
