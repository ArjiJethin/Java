public class Problem112 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(8,
                new TreeNode(11, new TreeNode(7), new TreeNode(2)), new TreeNode(13, null, new TreeNode(4))));
        int targetSum = 22;
        Solution solution = new Solution();
        boolean result = solution.hasPathSum(root, targetSum);
        System.out.println("Has Path Sum: " + result);
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    private boolean dfs(TreeNode root, int s) {
        if (root == null) {
            return false;
        }
        s -= root.val;
        if (root.left == null && root.right == null && s == 0) {
            return true;
        }
        return dfs(root.left, s) || dfs(root.right, s);
    }
}