package day042;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 *
 * @author created by sunjy on 2/11/24
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Visit the root
        result.add(node.val);

        // Traverse left subtree
        preorder(node.left, result);

        // Traverse right subtree
        preorder(node.right, result);
    }

}
