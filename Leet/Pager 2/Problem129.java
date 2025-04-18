public class Problem129 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Solution solution = new Solution();
        int result = solution.sumNumbers(root);
        System.out.println("Sum of all numbers formed by root-to-leaf paths: " + result);
    }
}

class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int s) {
        if (root == null) {
            return 0;
        }
        s = s * 10 + root.val;
        if (root.left == null && root.right == null) {
            return s;
        }
        return dfs(root.left, s) + dfs(root.right, s);
    }
}