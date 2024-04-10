package day051_day100.day094;

import java.util.Arrays;

/**
 * 345. Reverse Vowels of a String
 *
 * @author created by sunjy on 4/3/24
 */
public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left <= right) {
            char leftChar = chars[left];
            char rightChar = chars[right];
            boolean leftIsVowel = vowels.indexOf(leftChar) >= 0;
            boolean rightIsVowel = vowels.indexOf(rightChar) >= 0;
            if (leftIsVowel && rightIsVowel) {
                char temp = chars[left];
                chars[left] = rightChar;
                chars[right] = temp;
                left++;
                right--;
            } else if (!leftIsVowel && !rightIsVowel) {
                left++;
                right--;
            } else if (leftIsVowel) {
                right--;
            } else {
                left++;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

}
