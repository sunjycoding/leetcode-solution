package day058;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 *
 * @author created by sunjy on 2/27/24
 */
public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0; // Edge case: if the tree is empty.
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int result = 0; // Initialize the variable to store the bottom-left value.

        while (!queue.isEmpty()) {
            int size = queue.size(); // Get the number of nodes at the current level.

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();

                // For the first node of each level, update the result.
                if (i == 0) {
                    result = currentNode.val;
                }

                // Add child nodes to the queue for the next level's traversal.
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }

        return result; // The last updated value will be the bottom-left value.
    }

}
