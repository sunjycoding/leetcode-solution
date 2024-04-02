package day092;

/**
 * 605. Can Place Flowers
 *
 * @author created by sunjy on 4/1/24
 */
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if current plot is empty, and the plots before and after it are either empty or boundaries
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Plant a flower here
                flowerbed[i] = 1;
                // Decrement the number of flowers needed to plant
                n--;
            }
            // If we have planted all required flowers, we can stop early
            if (n <= 0) {
                return true;
            }
        }
        // Check if we were able to plant all flowers
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

}
