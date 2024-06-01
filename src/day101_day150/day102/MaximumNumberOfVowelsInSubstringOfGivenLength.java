package day101_day150.day102;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 *
 * @author created by sunjy on 4/11/24
 */
public class MaximumNumberOfVowelsInSubstringOfGivenLength {

    public static int maxVowels(String s, int k) {
        int maxVowels = 0, currentVowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is a vowel
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }

            // Once we reach the window size k, start sliding the window
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    currentVowelCount--;
                }
            }

            // Update maxVowels after the first k-1 characters
            if (i >= k - 1) {
                maxVowels = Math.max(maxVowels, currentVowelCount);
            }
        }
        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;
        System.out.println(maxVowels(s, k));
    }

}
