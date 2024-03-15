package day074;

/**
 * 383. Ransom Note
 *
 * @author created by sunjy on 3/14/24
 */
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        // Initialize an array to hold the count of each character in the magazine.
        // Assuming the input consists only of lowercase letters, we need 26 slots.
        int[] charCount = new int[26];

        // Count each character in the magazine.
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Try to construct the ransom note from the magazine.
        for (char c : ransomNote.toCharArray()) {
            // If a character is not available or used up, return false.
            if (--charCount[c - 'a'] < 0) {
                return false;
            }
        }

        // If we've made it here, it means the ransom note can be constructed.
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "";
        String magazine = "";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
