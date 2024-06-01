package day101_day150.day139;

/**
 * 1863. Sum of All Subset XOR Totals
 *
 * @author created by sunjy on 5/19/24
 */
public class SumAllSubsetXORTotals {

    public int subsetXORSum(int[] nums) {
        return subsetXOR(nums, 0, 0);
    }

    private int subsetXOR(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            // We've considered all elements, return the current XOR total
            return currentXOR;
        } else {
            // Recurse by including the current element in the XOR
            int include = subsetXOR(nums, index + 1, currentXOR ^ nums[index]);
            // Recurse by excluding the current element from the XOR
            int exclude = subsetXOR(nums, index + 1, currentXOR);
            // Return the sum of XORs from including and excluding the current element
            return include + exclude;
        }
    }

}
