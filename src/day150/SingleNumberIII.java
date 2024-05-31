package day150;

/**
 * 260. Single Number III
 *
 * @author created by sunjy on 5/30/24
 */
public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all elements to get the XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find any bit that is set in xor (differs between the two unique numbers)
        int rightmostSetBit = xor & -xor;

        // Step 3: Divide all numbers into two groups and XOR within each group
        int[] result = {0, 0}; // This will store the two unique numbers
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                result[0] ^= num; // Number belongs to the first group
            } else {
                result[1] ^= num; // Number belongs to the second group
            }
        }

        return result;
    }

}
