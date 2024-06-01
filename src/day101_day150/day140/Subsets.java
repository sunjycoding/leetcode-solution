package day101_day150.day140;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 *
 * @author created by sunjy on 5/20/24
 */
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(output, new ArrayList<>(), nums, 0);
        return output;
    }

    private static void backtrack(List<List<Integer>> output, List<Integer> current, int[] nums, int start) {
        // Add the current subset to the output
        output.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // Include the nums[i] in the subset
            current.add(nums[i]);
            // Move forward to include more elements in the subset
            backtrack(output, current, nums, i + 1);
            // Exclude the nums[i] from the subset for backtracking
            current.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(subsets(nums));
    }
}
