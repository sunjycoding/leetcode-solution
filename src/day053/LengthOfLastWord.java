package day053;

/**
 * 58. Length of Last Word
 *
 * @author created by sunjy on 2/22/24
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Find the index of the last space in the trimmed string
        int lastIndex = s.lastIndexOf(' ');

        // The length of the last word is the difference between the string's length and the index of the last space
        return s.length() - 1 - lastIndex;
    }

}
