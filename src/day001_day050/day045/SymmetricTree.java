package day001_day050.day045;

/**
 * 101. Symmetric Tree
 * 
 * @author created by sunjy on 2/14/24
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        // A null tree is symmetric
        if (root == null) {
            return true;
        }
        // Check if the tree is symmetric starting from the root
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        // If both subtrees are null, they are mirror images
        if (left == null && right == null) {
            return true;
        }
        // If only one of the subtrees is null, they are not mirror images
        if (left == null || right == null) {
            return false;
        }
        // The current nodes must have the same value, and their subtrees
        // must be the mirror images of each other
        return (left.val == right.val)
            && isMirror(left.left, right.right)
            && isMirror(left.right, right.left);
    }

}
