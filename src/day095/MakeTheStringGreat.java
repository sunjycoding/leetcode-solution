package day095;

/**
 * 1544. Make The String Great
 *
 * @author created by sunjy on 4/4/24
 */
public class MakeTheStringGreat {

    public static String makeGood(String s) {
        // Use a StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(s);

        // Indicates whether we found a pair to remove in the last iteration
        boolean found;
        do {
            found = false; // Reset flag for this iteration
            // Iterate over the string, checking for bad pairs
            for (int i = 0; i < sb.length() - 1; i++) {
                char current = sb.charAt(i);
                char next = sb.charAt(i + 1);
                // Check if current and next characters are a bad pair (ignore case difference only)
                if (Math.abs(current - next) == 32) {
                    // Found a bad pair, remove both characters
                    sb.delete(i, i + 2);
                    found = true; // Indicate a pair was found and removed
                    break; // Restart checking from the beginning
                }
            }
        } while (found); // Continue as long as we're finding and removing bad pairs

        // Return the resulting "good" string
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

}
