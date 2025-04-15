
public class Problem35 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(solution.searchInsert(nums, 5)); // Output: 2
        System.out.println(solution.searchInsert(nums, 2)); // Output: 1
        System.out.println(solution.searchInsert(nums, 7)); // Output: 4
        System.out.println(solution.searchInsert(nums, 0)); // Output: 0
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}