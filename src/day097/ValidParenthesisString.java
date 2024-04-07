package day097;

/**
 * 678. Valid Parenthesis String
 *
 * @author created by sunjy on 4/6/24
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        // minimum number of open parentheses
        int low = 0;
        // maximum number of open parentheses
        int high = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++; // Must be matched
                high++; // Can be matched
            } else if (c == ')') {
                if (low > 0) {
                    low--; // Prefer to match an open parenthesis
                }
                high--; // Must match an open parenthesis
            } else { // '*'
                if (low > 0) {
                    low--; // '*' can be an empty string
                }
                high++; // '*' can be '('
            }
            if (high < 0) {
                return false; // More ')' than '('
            }
        }
        return low == 0; // All '(' must be matched
    }

}
