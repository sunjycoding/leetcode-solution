package day051_day100.day077;

/**
 * 9. Palindrome Number
 *
 * @author created by sunjy on 3/17/24
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes.
        // Also, if the last digit of the number is 0, the first digit must also be 0; thus, x must be 0.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // When the original number is less than the reversed number, it means we've processed half of the number digits.
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // The number is a palindrome if the original number is the same as the reversed number
        // or if the original number is the same as the reversed number without the last digit
        // (which applies to numbers with an odd number of digits).
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
