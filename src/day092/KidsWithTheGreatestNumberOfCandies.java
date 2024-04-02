package day092;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 *
 * @author created by sunjy on 4/1/24
 */
public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            boolean max = true;
            for (int j = 0; j < candies.length; j++) {
                if (j == i) {
                    continue;
                }
                if (candies[j] > sum) {
                    max = false;
                    break;
                }
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

}
