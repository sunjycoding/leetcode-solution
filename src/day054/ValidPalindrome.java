package day054;

/**
 * 125. Valid Palindrome
 *
 * @author created by sunjy on 2/23/24
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String normalized = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Initialize two pointers
        int left = 0, right = normalized.length() - 1;

        // Check for palindrome
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; // Characters do not match
            }
            left++;  // Move left pointer to the right
            right--; // Move right pointer to the left
        }

        return true; // All characters matched, it's a palindrome
    }

}
