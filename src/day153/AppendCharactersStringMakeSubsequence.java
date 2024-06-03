package day153;

/**
 * 2486. Append Characters to String to Make Subsequence
 *
 * @author created by sunjy on 6/2/24
 */
public class AppendCharactersStringMakeSubsequence {

    public int appendCharacters(String s, String t) {
        int i = 0;  // Pointer for s
        int j = 0;  // Pointer for t

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            // When characters match
            if (s.charAt(i) == t.charAt(j)) {
                j++;  // Move the pointer in t
            }
            i++;  // Always move the pointer in s
        }

        // The characters in t from `j` to the end need to be appended to s
        return t.length() - j;
    }

}
