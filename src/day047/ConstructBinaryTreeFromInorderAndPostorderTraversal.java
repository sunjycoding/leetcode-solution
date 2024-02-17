package day047;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 *
 * @author created by sunjy on 2/16/24
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    int postIndex;
    Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Initialize postIndex to the last element
        postIndex = postorder.length - 1;
        inorderIndexMap = new HashMap<>();

        // Build a hashmap to store the value -> index pairs for inorder traversal
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTreeRecursive(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeRecursive(int[] postorder, int left, int right) {
        // If there are no elements to construct the tree
        if (left > right) {
            return null;
        }

        // Select the postIndex element as the root and decrement it
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);

        // Build right subtree before left subtree since we are decrementing postIndex
        root.right = buildTreeRecursive(postorder, inorderIndexMap.get(rootValue) + 1, right);
        root.left = buildTreeRecursive(postorder, left, inorderIndexMap.get(rootValue) - 1);

        return root;
    }
}
