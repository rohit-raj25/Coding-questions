import java.util.*;

public class q4 {
    static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static void leafNodes(Node root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        if (root.left != null) {
            leafNodes(root.left);
        }

        if (root.right != null) {
            leafNodes(root.right);
        }
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        leafNodes(root);

        sc.close(); // Close the scanner
    }
}
