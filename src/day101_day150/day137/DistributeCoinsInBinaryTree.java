package day101_day150.day137;

/**
 * 979. Distribute Coins in Binary Tree
 *
 * @author created by sunjy on 5/17/24
 */
public class DistributeCoinsInBinaryTree {

    private int moves = 0;

    public int distributeCoins(TreeNode root) {
        distributeCoinsHelper(root);
        return moves;
    }

    private int distributeCoinsHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftCoins = distributeCoinsHelper(node.left);
        int rightCoins = distributeCoinsHelper(node.right);
        moves += Math.abs(leftCoins) + Math.abs(rightCoins);

        return node.val + leftCoins + rightCoins - 1;
    }

}
