package day051_day100.day098;

/**
 * 11. Container With Most Water
 *
 * @author created by sunjy on 4/7/24
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
