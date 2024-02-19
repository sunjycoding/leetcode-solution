package day049;

/**
 * 98. Validate Binary Search Tree
 *
 * @author created by sunjy on 2/18/24
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        // An empty tree is a valid BST
        if (node == null) {
            return true;
        }

        int val = node.val;
        // Check current node's value against lower and upper limits
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        // Recursively check the left subtree and right subtree
        // For the left subtree, update the upper limit to current node's value
        // For the right subtree, update the lower limit to current node's value
        if (!isValidBST(node.left, lower, val)) {
            return false;
        }
        if (!isValidBST(node.right, val, upper)) {
            return false;
        }

        // If all checks pass, it's a valid BST
        return true;
    }


}
