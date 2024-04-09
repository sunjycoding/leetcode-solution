package day099;

/**
 * 443. String Compression
 *
 * @author created by sunjy on 4/8/24
 */
public class StringCompression {

    public int compress(char[] chars) {
        int index = 0; // Index to write next character or count
        int i = 0; // Iterator for chars

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0; // To count occurrences of currentChar

            // Use j to find the end of the group of identical characters
            int j = i;
            while (j < chars.length && chars[j] == currentChar) {
                j++;
                count++;
            }

            // Write the character to chars[index]
            chars[index++] = currentChar;

            // If count > 1, convert it to string and write each character
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }

            // Move i to the next group
            i = j;
        }

        return index; // The new length of the array
    }

}
