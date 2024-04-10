package day051_day100.day067;

/**
 * 5. Longest Palindromic Substring
 *
 * @author created by sunjy on 3/7/24
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substr = s.substring(i, j + 1);
                if (isPalindrome(substr) && substr.length() > longestPalindrome.length()) {
                    longestPalindrome = substr;
                }
            }
        }
        return longestPalindrome;
    }

    // Helper method to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
