package day139;

/**
 * 2331. Evaluate Boolean Binary Tree
 *
 * @author created by sunjy on 5/19/24
 */
public class EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        // Base case for leaf nodes
        if (root.left == null && root.right == null) {
            // Return true if value is 1, false if value is 0
            return root.val == 1;
        }

        // Recursively evaluate the left and right subtrees
        boolean leftValue = evaluateTree(root.left);
        boolean rightValue = evaluateTree(root.right);

        // Evaluate the current node based on its value (2 for OR, 3 for AND)
        if (root.val == 2) {
            // Perform OR operation
            return leftValue || rightValue;
        } else if (root.val == 3) {
            // Perform AND operation
            return leftValue && rightValue;
        }

        // Ideally, we should never reach here in a correct input according to the problem statement
        return false;
    }

}
