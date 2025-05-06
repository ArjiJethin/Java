public class Problem114 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4, null, new TreeNode(5)));
        Solution solution = new Solution();
        solution.flatten(root);
        // Print the flattened tree
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}

class Solution {
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}