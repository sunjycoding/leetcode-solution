package day101_day150.day104;

import java.util.Arrays;

/**
 * 1657. Determine if Two Strings Are Close
 *
 * @author created by sunjy on 4/13/24
 */
public class DetermineIfTwoStringsAreClose {

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            // Strings of different lengths cannot be close
            return false;
        }

        // Frequency count for word1
        int[] count1 = new int[26];
        // Frequency count for word2
        int[] count2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            // Populate frequency array for word1
            count1[word1.charAt(i) - 'a']++;
            // Populate frequency array for word2
            count2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0)) {
                // If one string has a character the other does not, they cannot be close
                return false;
            }
        }

        // Sort the frequency array for word1
        Arrays.sort(count1);
        // Sort the frequency array for word2
        Arrays.sort(count2);

        // Check if sorted frequency arrays are the same
        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }

}
