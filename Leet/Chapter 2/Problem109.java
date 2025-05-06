import java.util.*;

public class Problem109 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9)))));
        Solution solution = new Solution();
        TreeNode root = solution.sortedListToBST(head);
        System.out.println("Root: " + root.val);
    }
}

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        for (; head != null; head = head.next) {
            nums.add(head.val);
        }
        return buildBST(nums, 0, nums.size() - 1);
    }

    private TreeNode buildBST(List<Integer> nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        return root;
    }
}