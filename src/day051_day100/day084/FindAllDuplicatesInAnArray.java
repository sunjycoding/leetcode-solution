package day051_day100.day084;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 *
 * @author created by sunjy on 3/24/24
 */
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Calculate the index for marking
            if (nums[index] < 0) {
                // If the value at this index is already negative, it's a duplicate
                duplicates.add(Math.abs(nums[i]));
            } else {
                // Mark the value at this index as visited by making it negative
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }

}
