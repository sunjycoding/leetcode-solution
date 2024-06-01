package day101_day150.day142;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2597. The Number of Beautiful Subsets
 *
 * @author created by sunjy on 5/22/24
 */
public class TheNumberBeautifulSubsets {

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> path = new ArrayList<>();
        return countSubsets(nums, k, 0, path) - 1; // Subtract 1 to exclude the empty set
    }

    private int countSubsets(int[] nums, int k, int start, List<Integer> path) {
        int count = 1; // Start with the current path as a valid subset (including empty set initially)

        for (int i = start; i < nums.length; i++) {
            // Check if we can add nums[i] to the path without violating the condition
            boolean canAdd = true;
            for (int num : path) {
                if (Math.abs(num - nums[i]) == k) {
                    canAdd = false;
                    break;
                }
            }

            if (canAdd) {
                path.add(nums[i]);
                count += countSubsets(nums, k, i + 1, path);
                path.removeLast(); // Backtrack
            }
        }

        return count;
    }

}
