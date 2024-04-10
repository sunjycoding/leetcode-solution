package day051_day100.day061;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 *
 * @author created by sunjy on 3/1/24
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the recursion with an empty list and the original array
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            // If the tempList is the same size as nums, it's a full permutation; add it to the result
            result.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) {
                    // Element already exists, skip
                    continue;
                }
                tempList.add(num);
                // Recurse with the new element added
                backtrack(result, tempList, nums);
                // Remove the last element added for backtracking
                tempList.removeLast();
            }
        }
    }

}
