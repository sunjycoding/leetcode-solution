package day057;

/**
 * 543. Diameter of Binary Tree
 *
 * @author created by sunjy on 2/26/24
 */
public class DiameterOfBinaryTree {

    int maxDiameter = 0; // Store the maximum diameter found so far

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root); // Start the process from the root
        return maxDiameter;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0; // Base case: the height of a null node is 0
        }

        int leftHeight = maxDepth(node.left); // Height of left subtree
        int rightHeight = maxDepth(node.right); // Height of right subtree

        // Update the maximum diameter if the path through the current node is longer
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

}
