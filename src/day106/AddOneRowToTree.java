package day106;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 623. Add One Row to Tree
 *
 * @author created by sunjy on 4/15/24
 */
public class AddOneRowToTree {

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val); // Create a new node
            newRoot.left = root; // Original tree becomes left child of new root
            return newRoot; // Return new root
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int currentDepth = 1;

        // Traverse the tree level by level until reaching the level before 'depth'
        while (currentDepth < depth - 1) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode != null) {
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
            }
            currentDepth++;
        }

        // We are now at level `depth - 1`, so we can add the new row
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            TreeNode tempLeft = currentNode.left;
            TreeNode tempRight = currentNode.right;

            currentNode.left = new TreeNode(val); // New node with value 'val'
            currentNode.right = new TreeNode(val); // New node with value 'val'

            currentNode.left.left = tempLeft; // Attach original left subtree
            currentNode.right.right = tempRight; // Attach original right subtree
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);
        System.out.println(addOneRow(root, 1, 2));
    }

}
