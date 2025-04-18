import java.util.*;

public class Problem113 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, null, new TreeNode(4, null, new TreeNode(1))));
        int targetSum = 22;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.pathSum(root, targetSum);
        System.out.println("Path Sum: " + result);
    }
}

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ans;
    }

    private void dfs(TreeNode root, int s) {
        if (root == null) {
            return;
        }
        s -= root.val;
        t.add(root.val);
        if (root.left == null && root.right == null && s == 0) {
            ans.add(new ArrayList<>(t));
        }
        dfs(root.left, s);
        dfs(root.right, s);
        t.remove(t.size() - 1);
    }
}