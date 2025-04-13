
public class Problem101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        Solution solution = new Solution();
        boolean result = solution.isSymmetric(root);
        System.out.println("Is Symmetric: " + result);
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }

    private boolean dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
    }
}