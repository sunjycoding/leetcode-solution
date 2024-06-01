package day101_day150.day107;

/**
 * 988. Smallest String Starting From Leaf
 *
 * @author created by sunjy on 4/16/24
 */
public class SmallestStringStartingFromLeaf {

    private String smallestString = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallestString;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) {
            return;  // base case: null node
        }

        // Convert current node's value to corresponding character
        char currentChar = (char) (node.val + 'a');
        path.append(currentChar);  // append current character to path

        if (node.left == null && node.right == null) {  // check if it's a leaf node
            path.reverse();  // reverse to make leaf to root
            String candidate = path.toString();
            path.reverse();  // reverse back to maintain original path for backtracking

            // Update the smallestString found so far
            if (smallestString == null || candidate.compareTo(smallestString) < 0) {
                smallestString = candidate;
            }
        } else {
            // Recursive DFS to left and right children
            dfs(node.left, path);
            dfs(node.right, path);
        }

        path.deleteCharAt(path.length() - 1);  // backtrack: remove last character
    }

}
