
public class Problem11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = solution.maxArea(height);
        System.out.println("Max area: " + result);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        while (i < j) {
            int t = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, t);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return ans;
    }
}