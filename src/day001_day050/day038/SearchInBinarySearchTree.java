package day001_day050.day038;

/**
 * 700. Search in a Binary Search Tree
 *
 * @author created by sunjy on 2/7/24
 */
public class SearchInBinarySearchTree {

    public static TreeNode searchBST(TreeNode root, int val) {
        // Base case: root is null or the value of the current node is the value we are searching for.
        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            // If the value is less than the root's value, search in the left subtree.
            return searchBST(root.left, val);
        } else {
            // If the value is greater than the root's value, search in the right subtree.
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        System.out.println(searchBST(root, val));
    }

}
