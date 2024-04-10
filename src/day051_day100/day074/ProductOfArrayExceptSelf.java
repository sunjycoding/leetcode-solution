package day051_day100.day074;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 *
 * @author created by sunjy on 3/14/24
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        // The answer array to hold the products
        int[] answer = new int[length];

        // First pass: calculate left products
        // There's no element to the left of the first element
        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            answer[i] = leftProduct;
            // Update the product for the next iteration
            leftProduct *= nums[i];
        }

        // Second pass: calculate right products and multiply with left products
        // There's no element to the right of the last element
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            // Update the product for the next iteration
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
