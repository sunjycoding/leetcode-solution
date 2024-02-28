package day001_day050.day008;

/**
 * 941. Valid Mountain Array
 *
 * @author created by sunjy on 1/8/24
 */
public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        int turn = 0;
        if (arr.length < 3) {
            return false;
        }
        if (arr[1] <= arr[0]) {
            return false;
        }
        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (turn == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < max) {
                    max = arr[i];
                    ++turn;
                } else {
                    return false;
                }
            } else {
                if (arr[i] >= max) {
                    return false;
                } else {
                    max = arr[i];
                }
            }
        }
        return turn == 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }

}
