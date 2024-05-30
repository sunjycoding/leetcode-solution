package day149;

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR
 *
 * @author created by sunjy on 5/29/24
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefix[i] == prefix[k + 1]) {
                    count += (k - i);
                }
            }
        }

        return count;
    }

}
