public class Problem99 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        Solution solution = new Solution();
        solution.recoverTree(root);
        // Output the tree after recovery
        System.out.println("Recovered tree root: " + root.val);
    }
}

class Solution {
    private TreeNode prev;
    private TreeNode first;
    private TreeNode second;

    public void recoverTree(TreeNode root) {
        dfs(root);
        int t = first.val;
        first.val = second.val;
        second.val = t;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        dfs(root.right);
    }
}