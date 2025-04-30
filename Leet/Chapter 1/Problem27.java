
public class Problem27 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = solution.removeElement(nums, val);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
}