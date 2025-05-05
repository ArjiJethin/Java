public class Problem83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}