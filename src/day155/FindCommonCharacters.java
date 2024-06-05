package day155;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 *
 * @author created by sunjy on 6/4/24
 */
public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {
        // Initialize an array to store the minimum frequency of each character
        int[] minFreq = new int[26];
        java.util.Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Count frequencies of each character for each word
        for (String word : words) {
            int[] charFreq = new int[26];
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }

            // Update the minimum frequencies
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }

        // Collect characters that appear in all strings
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }
}
