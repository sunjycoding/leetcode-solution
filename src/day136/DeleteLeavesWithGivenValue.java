package day136;

/**
 * 1325. Delete Leaves With a Given Value
 *
 * @author created by sunjy on 5/16/24
 */
public class DeleteLeavesWithGivenValue {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }

        return root;
    }

}
