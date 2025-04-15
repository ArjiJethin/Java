
public class Problem42 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(solution.trap(height));
    }
}

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int length = height.length;
        int[] leftMax = new int[length]; // `leftMax` represents the maximum height in the subarray from the leftmost
                                         // index to the current index
        int[] rightMax = new int[length]; // `rightMax` represents the maximum height in the subarray from the current
                                          // index to the rightmost index
        leftMax[0] = height[0];
        for (int i = 1; i < length; i++)
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        rightMax[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--)
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        int amount = 0;
        for (int i = 0; i < length; i++)
            amount += Math.min(leftMax[i], rightMax[i]) - height[i];
        return amount;
    }
}