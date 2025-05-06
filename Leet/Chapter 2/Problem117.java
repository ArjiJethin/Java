public class Problem117 {
    public static void main(String[] args) {
        Node root = new Node(1, new Node(2, null, new Node(5)), new Node(3, null, new Node(4)));
        Solution solution = new Solution();
        solution.connect(root);
        // Print the connected tree
        Node node = root;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}

class Solution {
    private Node prev, next;

    public Node connect(Node root) {
        Node node = root;
        while (node != null) {
            prev = null;
            next = null;
            while (node != null) {
                modify(node.left);
                modify(node.right);
                node = node.next;
            }
            node = next;
        }
        return root;
    }

    private void modify(Node curr) {
        if (curr == null) {
            return;
        }
        if (next == null) {
            next = curr;
        }
        if (prev != null) {
            prev.next = curr;
        }
        prev = curr;
    }
}