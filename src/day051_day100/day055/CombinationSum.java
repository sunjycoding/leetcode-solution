package day051_day100.day055;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. Combination Sum
 *
 * @author created by sunjy on 2/24/24
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result, 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, int sum, List<Integer> current, List<List<Integer>> result, int start) {
        // If the current sum is exactly equal to the target, add the current combination to the result
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If the sum exceeds the target, return to avoid further unnecessary processing
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Add the candidate to the current combination
            current.add(candidates[i]);
            // Recurse with the updated sum and current combination, moving forward with the same candidate (i) to allow duplicates
            backtrack(candidates, target, sum + candidates[i], current, result, i);
            // Remove the last added candidate to try the next one, backtracking step
            current.removeLast();
        }
    }

}
