public class Problem98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        Solution solution = new Solution();
        boolean result = solution.isValidBST(root);
        System.out.println("Is Valid BST: " + result);
    }
}

class Solution {
    private Integer prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!dfs(root.left)) {
            return false;
        }
        if (prev != null && prev >= root.val) {
            return false;
        }
        prev = root.val;
        if (!dfs(root.right)) {
            return false;
        }
        return true;
    }
}