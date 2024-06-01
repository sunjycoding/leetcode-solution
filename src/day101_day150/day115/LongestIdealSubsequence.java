package day101_day150.day115;

/**
 * 2370. Longest Ideal Subsequence
 *
 * @author created by sunjy on 4/24/24
 */
public class LongestIdealSubsequence {

    public static int longestIdealString(String s, int k) {
        // This map will store the maximum length of the ideal subsequence ending with each character
        int[] dp = new int[128]; // ASCII table size to cover all lowercase and uppercase letters

        int maxLength = 0;

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // Initialize the maximum length for the current character as 1 (the character itself)
            int maxCurrent = 1;

            // Check characters within the range [c-k, c+k] to extend the subsequence
            for (char x = (char) Math.max('a', c - k); x <= Math.min('z', c + k); x++) {
                // Update maxCurrent by considering the length of subsequences ending with x
                maxCurrent = Math.max(maxCurrent, dp[x] + 1);
            }

            // Update the dp table for the character c
            dp[c] = maxCurrent;

            // Update the overall maximum length found so far
            maxLength = Math.max(maxLength, maxCurrent);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eduktdb";
        int k = 15;
        System.out.println(longestIdealString(s, k));
    }
}
