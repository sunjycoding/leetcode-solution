package day051_day100.day094;

/**
 * 1614. Maximum Nesting Depth of the Parentheses
 *
 * @author created by sunjy on 4/3/24
 */
public class MaximumNestingDepthOfTheParentheses {

    public static int maxDepth(String s) {
        int currentDepth = 0; // Track the depth of the current position in the string
        int maxDepth = 0; // Track the maximum depth found so far

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                // If the current character is '(', increase the current depth
                currentDepth++;
                // Update the maximum depth if the current depth is greater
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                // If the current character is ')', decrease the current depth
                currentDepth--;
            }
            // No need to do anything for characters other than '(' or ')'
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

}
