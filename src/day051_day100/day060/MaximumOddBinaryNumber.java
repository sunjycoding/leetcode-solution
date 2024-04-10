package day051_day100.day060;

/**
 * 2864. Maximum Odd Binary Number
 *
 * @author created by sunjy on 2/29/24
 */
public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        // Count the number of '1's and '0's in the input string
        int ones = 0;
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            } else {
                zeros++;
            }
        }

        // Build the maximum odd binary number
        StringBuilder result = new StringBuilder();

        // Add all '1's except one to the start of the string
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }

        // If there are '0's, add them next
        for (int i = 0; i < zeros; i++) {
            result.append('0');
        }

        // Ensure the string ends with '1' to make it odd
        result.append('1');

        return result.toString();
    }

}
