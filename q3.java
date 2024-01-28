import java.util.*;

public class q3 {
    // print the node of specific level
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to print nodes at the given level
    static void printLevel(Node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        } else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    // Function to insert a new node with the given data
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root; // Added this line to fix the issue
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int k = sc.nextInt();
        printLevel(root, k + 1);

        sc.close(); // Close the scanner
    }
}
