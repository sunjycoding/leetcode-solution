package day001_day050.day040;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * @author created by sunjy on 2/9/24
 */
public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            // Base case: if the tree is empty
            return 0;
        } else {
            // Recursively find the depth of the left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // The maximum depth of the tree is the max of left depth and right depth plus one (for the root)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }
}
