public class Problem100 {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        boolean result = solution.isSameTree(p, q);
        System.out.println("Is Same Tree: " + result);
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}