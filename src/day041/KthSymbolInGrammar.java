package day041;

/**
 * 779. K-th Symbol in Grammar
 *
 * @author created by sunjy on 2/10/24
 */
public class KthSymbolInGrammar {

    public int kthGrammar(int n, int k) {
        // Base case: If n is 1, the first symbol is always 0.
        if (n == 1) {
            return 0;
        }
        // Determine the length of the row, which is 2^(n-1).
        int lengthOfRow = (int) Math.pow(2, n - 1);
        // If k is in the first half of the row, it's the same as the kth symbol of the previous row.
        if (k <= lengthOfRow / 2) {
            return kthGrammar(n - 1, k);
        } else {
            // If k is in the second half, it's the complement of the kth symbol of the previous row.
            // Use XOR to find the complement: 0 becomes 1, and 1 becomes 0.
            return 1 - kthGrammar(n - 1, k - lengthOfRow / 2);
        }
    }


}
