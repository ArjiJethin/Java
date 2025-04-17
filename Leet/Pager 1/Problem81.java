
public class Problem81 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        boolean result = solution.search(nums, target);
        System.out.println(result); // Output: true
    }
}

class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] > nums[r]) {
                if (nums[l] <= target && target <= nums[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] < nums[r]) {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            } else {
                --r;
            }
        }
        return nums[l] == target;
    }
}