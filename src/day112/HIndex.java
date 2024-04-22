package day112;

/**
 * 274. H-Index
 *
 * @author created by sunjy on 4/21/24
 */
public class HIndex {

    public int hIndex(int[] citations) {
        int n = citations.length;
        // paperCount[i] means number of papers with exactly i citations
        int[] paperCount = new int[n + 1];

        // Fill the paperCount array
        for (int c : citations) {
            if (c > n) {
                // All citations more than n are treated as n
                paperCount[n]++;
            } else {
                paperCount[c]++;
            }
        }

        int totalPapers = 0;
        for (int i = n; i >= 0; i--) {
            // Total papers with at least i citations
            totalPapers += paperCount[i];
            if (totalPapers >= i) {
                // i is the h-index if there are at least i papers with at least i citations
                return i;
            }
        }
        return 0;
    }

}
