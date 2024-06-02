package day152;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1704. Determine if String Halves Are Alike
 *
 * @author created by sunjy on 6/1/24
 */
public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        // Define the set of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        // Find the midpoint of the string
        int mid = s.length() / 2;
        int countA = 0, countB = 0;

        // Iterate over each half of the string
        for (int i = 0; i < mid; i++) {
            // Check and count vowels in the first half
            if (vowels.contains(s.charAt(i))) {
                countA++;
            }
            // Check and count vowels in the second half
            if (vowels.contains(s.charAt(i + mid))) {
                countB++;
            }
        }

        // Return true if the counts are equal, otherwise false
        return countA == countB;
    }

}
