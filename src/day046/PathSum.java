package day046;

/**
 * 112. Path Sum
 *
 * @author created by sunjy on 2/15/24
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the tree is empty, there's no path, return false
        if (root == null) {
            return false;
        }

        // Check if it's a leaf node (no left or right children)
        boolean isLeaf = (root.left == null) && (root.right == null);
        // If it's a leaf node and its value equals the remaining target sum, we found a path
        if (isLeaf && root.val == targetSum) {
            return true;
        }

        // Recursively check the left and right subtrees, if they exist
        boolean hasPathInLeftSubtree = false;
        boolean hasPathInRightSubtree = false;

        // Only proceed with the left subtree if it's not null
        if (root.left != null) {
            hasPathInLeftSubtree = hasPathSum(root.left, targetSum - root.val);
        }

        // Only proceed with the right subtree if it's not null
        if (root.right != null) {
            hasPathInRightSubtree = hasPathSum(root.right, targetSum - root.val);
        }

        // If either subtree has a path sum that equals the target, return true
        return hasPathInLeftSubtree || hasPathInRightSubtree;
    }

}
