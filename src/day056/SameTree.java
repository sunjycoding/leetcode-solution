package day056;

/**
 * 100. Same Tree
 *
 * @author created by sunjy on 2/25/24
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are empty, they are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of the trees is empty, they are not the same
        if (p == null || q == null) {
            return false;
        }

        // If the values of the current nodes are not the same, trees are not the same
        if (p.val != q.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
