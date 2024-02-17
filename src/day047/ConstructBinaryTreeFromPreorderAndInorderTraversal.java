package day047;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 *
 * @author created by sunjy on 2/16/24
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    int preorderIndex;
    Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        // The root node is the first element of preorder traversal
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Build the left and right subtrees
        root.left = arrayToTree(preorder, left, inorderIndexMap.get(rootValue) - 1);
        root.right = arrayToTree(preorder, inorderIndexMap.get(rootValue) + 1, right);

        return root;
    }

}
