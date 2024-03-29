package day088;

import java.util.Arrays;

/**
 * 2962. Count Subarrays Where Max Element Appears at Least K Times
 *
 * @author created by sunjy on 3/28/24
 */
public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {

    public long countSubarrays(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;

        while (r < n) {
            k -= nums[r] == mx ? 1 : 0;
            r++;
            while (k == 0) {
                k += nums[l] == mx ? 1 : 0;
                l++;
            }
            ans += l;
        }

        return ans;
    }

}
