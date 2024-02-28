package day001_day050.day023;

/**
 * 771. Jewels and Stones
 *
 * @author created by sunjy on 1/23/24
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (jewels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

}
