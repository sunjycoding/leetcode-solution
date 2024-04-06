package day096;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 *
 * @author created by sunjy on 4/5/24
 */
public class MinimumRemoveToMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> openParens = new Stack<>();
        Set<Integer> indicesToRemove = new HashSet<>();

        // First pass: Find indices of parentheses to remove
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                openParens.push(i);
            } else if (c == ')') {
                if (openParens.isEmpty()) {
                    indicesToRemove.add(i);
                } else {
                    openParens.pop();
                }
            }
        }
        // Add remaining open parentheses to removal set
        while (!openParens.isEmpty()) {
            indicesToRemove.add(openParens.pop());
        }

        // Build the result without the marked indices
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (!indicesToRemove.contains(i)) {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }

}
