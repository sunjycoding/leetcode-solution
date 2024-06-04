package day154;

/**
 * 409. Longest Palindrome
 *
 * @author created by sunjy on 6/3/24
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] charCounts = new int[128]; // Character count for ASCII values
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }

        int maxLength = 0;
        boolean foundOdd = false;
        for (int count : charCounts) {
            if (count % 2 == 0) {
                maxLength += count; // Add all even counts
            } else {
                maxLength += count - 1; // Add the even part of odd counts
                foundOdd = true; // At least one character has an odd count
            }
        }

        // If there is at least one odd, add 1 to place it in the middle
        if (foundOdd) {
            maxLength += 1;
        }

        return maxLength;
    }

}
