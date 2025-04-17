public class Problem86 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        int x = 3;
        Solution solution = new Solution();
        ListNode result = solution.partition(head, x);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode();
        ListNode d2 = new ListNode();
        ListNode t1 = d1, t2 = d2;
        while (head != null) {
            if (head.val < x) {
                t1.next = head;
                t1 = t1.next;
            } else {
                t2.next = head;
                t2 = t2.next;
            }
            head = head.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}