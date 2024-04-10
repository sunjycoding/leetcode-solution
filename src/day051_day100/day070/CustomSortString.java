package day051_day100.day070;

/**
 * 791. Custom Sort String
 *
 * @author created by sunjy on 3/10/24
 */
public class CustomSortString {

    public String customSortString(String order, String s) {
        // Step 1: Count occurrences of each character in s
        int[] count = new int[26]; // Assuming s consists of lowercase English letters
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Build the result string with characters in the order
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (count[c - 'a'] > 0) {
                result.append(c);
                count[c - 'a']--;
            }
        }

        // Step 3: Append the remaining characters not in order
        for (char c = 'a'; c <= 'z'; c++) {
            while (count[c - 'a'] > 0) {
                result.append(c);
                count[c - 'a']--;
            }
        }

        return result.toString();
    }

}
