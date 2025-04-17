import java.util.*;

public class Problem106 {
    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(inorder, postorder);
        System.out.println("Root: " + root.val);
    }
}

class Solution {
    private Map<Integer, Integer> indexes = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; ++i) {
            indexes.put(inorder[i], i);
        }
        return dfs(inorder, postorder, 0, 0, inorder.length);
    }

    private TreeNode dfs(int[] inorder, int[] postorder, int i, int j, int n) {
        if (n <= 0) {
            return null;
        }
        int v = postorder[j + n - 1];
        int k = indexes.get(v);
        TreeNode root = new TreeNode(v);
        root.left = dfs(inorder, postorder, i, j, k - i);
        root.right = dfs(inorder, postorder, k + 1, j + k - i, n - k + i - 1);
        return root;
    }
}