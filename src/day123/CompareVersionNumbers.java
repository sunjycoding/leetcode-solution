package day123;

/**
 * 165. Compare Version Numbers
 *
 * @author created by sunjy on 5/2/24
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");

        int maxLength = Math.max(revisions1.length, revisions2.length);

        for (int i = 0; i < maxLength; i++) {
            int revision1 = i < revisions1.length ? Integer.parseInt(revisions1[i]) : 0;
            int revision2 = i < revisions2.length ? Integer.parseInt(revisions2[i]) : 0;

            if (revision1 < revision2) {
                return -1;
            } else if (revision1 > revision2) {
                return 1;
            }
        }

        return 0;
    }

}
