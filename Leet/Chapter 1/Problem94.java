import java.util.ArrayList;
import java.util.List;

public class Problem94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        while (root != null) {
            if (root.left == null) {
                ans.add(root.val);
                root = root.right;
            } else {
                TreeNode prev = root.left;
                while (prev.right != null && prev.right != root) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = root;
                    root = root.left;
                } else {
                    ans.add(root.val);
                    prev.right = null;
                    root = root.right;
                }
            }
        }

        return ans;
    }
}
