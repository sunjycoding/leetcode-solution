package day101_day150.day105;

/**
 * 129. Sum Root to Leaf Numbers
 *
 * @author created by sunjy on 4/14/24
 */
public class SumRootToLeafNumbers {

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return 0; // Base case: if the node is null, return 0
        }

        // Calculate the new sum including the current node's value
        currentSum = currentSum * 10 + node.val;

        // Check if the current node is a leaf node
        if (node.left == null && node.right == null) {
            return currentSum; // If it's a leaf, return the current sum formed
        }

        // Recursively calculate the sum for both subtrees and return the total
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }

    public static void main(String[] args) {

    }

}
