package day076;

/**
 * 242. Valid Anagram
 *
 * @author created by sunjy on 3/16/24
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Step 1: Quick length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Count characters
        // Assuming the alphabet is 'a' to 'z'
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // Increment count for char in s
            count[s.charAt(i) - 'a']++;

            // Decrement count for char in t
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check zero counts
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                // If any count is not zero, s and t are not anagrams
                return false;
            }
        }

        // If all counts are zero, s and t are anagrams
        return true;
    }

}
