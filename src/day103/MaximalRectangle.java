package day103;

import java.util.Stack;

/**
 * 85. Maximal Rectangle
 *
 * @author created by sunjy on 4/12/24
 */
public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int cols = matrix[0].length;
        int[] height = new int[cols];
        int maxArea = 0;

        for (char[] chars : matrix) {
            for (int j = 0; j < cols; j++) {
                // Update the height to count consecutive '1's
                if (chars[j] == '1') {
                    height[j] += 1;
                } else {
                    height[j] = 0;
                }
            }

            // Calculate the maximum area for the histogram created from this row
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index <= heights.length) {
            int currHeight = (index == heights.length) ? 0 : heights[index];

            if (stack.isEmpty() || currHeight >= heights[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }
        }

        return maxArea;
    }

}
