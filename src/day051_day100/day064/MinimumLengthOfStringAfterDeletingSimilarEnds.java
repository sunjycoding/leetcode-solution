package day051_day100.day064;

/**
 * 1750. Minimum Length of String After Deleting Similar Ends
 *
 * @author created by sunjy on 3/4/24
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;

        // Loop until the two pointers meet
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currentChar = s.charAt(left);
            // Move the left pointer to the right, skipping over all the same characters
            while (left <= right && s.charAt(left) == currentChar) {
                left++;
            }
            // Move the right pointer to the left, skipping over all the same characters
            while (left <= right && s.charAt(right) == currentChar) {
                right--;
            }
        }
        // Calculate the remaining length of the string
        return right - left + 1;
    }

}
