package day001_day050.day048;

/**
 * 912. Sort an Array
 *
 * @author created by sunjy on 2/17/24
 */
public class SortAnArray {

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);

            // Merge the sorted halves
            merge(nums, left, middle, right);
        }
    }

    private void merge(int[] nums, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            leftArr[i] = nums[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = nums[middle + 1 + j];
        }

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

}
