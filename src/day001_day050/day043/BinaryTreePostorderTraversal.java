package day001_day050.day043;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal
 *
 * @author created by sunjy on 2/12/24
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        postorder(node.left, result);
        // Traverse right subtree
        postorder(node.right, result);
        // Visit the root (current node)
        result.add(node.val);
    }

}
