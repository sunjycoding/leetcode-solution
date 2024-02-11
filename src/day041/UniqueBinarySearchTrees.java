package day041;

import java.util.ArrayList;
import java.util.List;

/**
 * 95. Unique Binary Search Trees II
 *
 * @author created by sunjy on 2/10/24
 */
public class UniqueBinarySearchTrees {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            // Generate all possible left and right subtrees
            List<TreeNode> leftTrees = generateTrees(start, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            // Connect left and right trees to the root i
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currentNode = new TreeNode(i);
                    currentNode.left = left;
                    currentNode.right = right;
                    allTrees.add(currentNode);
                }
            }
        }
        return allTrees;
    }

}
