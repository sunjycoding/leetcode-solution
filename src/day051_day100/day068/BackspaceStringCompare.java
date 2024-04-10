package day051_day100.day068;

/**
 * 844. Backspace String Compare
 *
 * @author created by sunjy on 3/8/24
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        // Process both strings and compare their final typed states
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String str) {
        // A stack to keep track of the characters
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                // Add character to the stack
                sb.append(c);
            } else if (!sb.isEmpty()) {
                // Simulate backspace
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

}
