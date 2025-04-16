
public class Problem53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(solution.maxSubArray(nums)); // Output: 6
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1, f = nums[0]; i < nums.length; ++i) {
            f = Math.max(f, 0) + nums[i];
            ans = Math.max(ans, f);
        }
        return ans;
    }
}