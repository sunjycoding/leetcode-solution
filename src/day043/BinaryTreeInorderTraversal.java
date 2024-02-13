package day043;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * @author created by sunjy on 2/12/24
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        inorder(node.left, result);
        // Visit the root (current node)
        result.add(node.val);
        // Traverse right subtree
        inorder(node.right, result);
    }

}
