package day101_day150.day104;

/**
 * 404. Sum of Left Leaves
 *
 * @author created by sunjy on 4/13/24
 */
public class SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        // Base case: if the tree is empty
        if (root == null) {
            return 0;
        }

        int sum = 0; // This will store the sum of all left leaves

        // Check if the current node's left child is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val; // It's a left leaf, add its value to sum
        }

        // Recursively call for the left subtree
        sum += sumOfLeftLeaves(root.left);

        // Recursively call for the right subtree
        sum += sumOfLeftLeaves(root.right);

        return sum; // Return the total sum calculated
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }

}
