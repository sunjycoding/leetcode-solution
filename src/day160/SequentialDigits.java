package day160;

import java.util.ArrayList;
import java.util.List;

/**
 * 1291. Sequential Digits
 *
 * @author created by sunjy on 6/9/24
 */
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";  // All possible sequential digits
        List<Integer> result = new ArrayList<>();

        // The length of numbers to consider
        int minLength = String.valueOf(low).length();
        int maxLength = String.valueOf(high).length();

        for (int length = minLength; length <= maxLength; length++) {
            // Generate numbers by sliding through 'digits'
            for (int start = 0; start <= digits.length() - length; start++) {
                // Substring of a specific length
                String numStr = digits.substring(start, start + length);
                int num = Integer.parseInt(numStr);

                // Check if the number is within the range
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }

}
