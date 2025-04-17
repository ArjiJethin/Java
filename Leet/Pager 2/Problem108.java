
public class Problem108 {
    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayToBST(nums);
        System.out.println("Root: " + root.val);
    }
}

class Solution {
    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return dfs(0, nums.length - 1);
    }

    private TreeNode dfs(int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        TreeNode left = dfs(l, mid - 1);
        TreeNode right = dfs(mid + 1, r);
        return new TreeNode(nums[mid], left, right);
    }
}