
public class Problem33 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = solution.search(nums, target);
        System.out.println(result); // Output: 4
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return nums[left] == target ? left : -1;
    }
}