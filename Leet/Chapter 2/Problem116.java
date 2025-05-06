import java.util.*;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = null;
    }
}

public class Problem116 {
    public static void main(String[] args) {
        Node root = new Node(1, new Node(2), new Node(3));
        Solution solution = new Solution();
        solution.connect(root);
        // Print the connected nodes
        System.out.println("Connected nodes:");
        System.out.println("Node 1 next: " + (root.next != null ? root.next.val : "null"));
        System.out.println("Node 2 next: " + (root.left.next != null ? root.left.next.val : "null"));
        System.out.println("Node 3 next: " + (root.right.next != null ? root.right.next.val : "null"));
    }
}

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node p = null;
            for (int n = q.size(); n > 0; --n) {
                Node node = q.poll();
                if (p != null) {
                    p.next = node;
                }
                p = node;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return root;
    }
}