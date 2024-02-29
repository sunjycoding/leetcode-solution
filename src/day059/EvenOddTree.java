package day059;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1609. Even Odd Tree
 *
 * @author created by sunjy on 2/28/24
 */
public class EvenOddTree {

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            // Track the previous value to compare with the current node's value.
            Integer prevValue = null;

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if (level % 2 == 0) {
                    // Even-indexed level: nodes must have odd values and be in strictly increasing order.
                    if (currentNode.val % 2 == 0 || (prevValue != null && currentNode.val <= prevValue)) {
                        return false;
                    }
                } else {
                    // Odd-indexed level: nodes must have even values and be in strictly decreasing order.
                    if (currentNode.val % 2 == 1 || (prevValue != null && currentNode.val >= prevValue)) {
                        return false;
                    }
                }
                // Update prevValue for the next iteration.
                prevValue = currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            level++;
        }
        // If all levels meet the conditions, return true.
        return true;
    }

}
