package day101;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 402. Remove K Digits
 *
 * @author created by sunjy on 4/10/24
 */
public class RemoveDigits {

    public static String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0"; // Special case: remove all digits
        }

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            // Remove the top element of the stack if it is greater than the current element
            // and we still have the option to remove more elements (k > 0)
            while (!stack.isEmpty() && k > 0 && stack.peek() > current) {
                stack.pop();
                k--;
            }
            stack.push(current);
        }

        // Remove the remaining digits from the end if we still have more to remove
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the final number from the stack
        StringBuilder smallest = new StringBuilder();
        while (!stack.isEmpty()) {
            smallest.append(stack.removeLast());
        }

        // Remove leading zeros
        while (smallest.length() > 1 && smallest.charAt(0) == '0') {
            smallest.deleteCharAt(0);
        }

        return smallest.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }

}
