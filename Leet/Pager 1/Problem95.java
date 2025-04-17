import java.util.ArrayList;
import java.util.List;

public class Problem95 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        List<TreeNode> result = solution.generateTrees(n);
        System.out.println("Unique BSTs: " + result.size());
        for (TreeNode tree : result) {
            printTree(tree);
            System.out.println();
        }
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}

class Solution {
    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }

    private List<TreeNode> dfs(int i, int j) {
        List<TreeNode> ans = new ArrayList<>();
        if (i > j) {
            ans.add(null);
            return ans;
        }
        for (int v = i; v <= j; ++v) {
            var left = dfs(i, v - 1);
            var right = dfs(v + 1, j);
            for (var l : left) {
                for (var r : right) {
                    ans.add(new TreeNode(v, l, r));
                }
            }
        }
        return ans;
    }
}