package day008;

/**
 * 1346. Check If N and Its Double Exist
 *
 * @author created by sunjy on 1/8/24
 */
public class CheckIfNAndItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i && arr[i] == arr[j] * 2) {
                    System.out.println("i: " + i + ", j: " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }

}
