package Trees;

public class balancedTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to check balanced tree
    boolean isBalanced(Node root) {
        return check(root) != -1;
    }

    // Returns height if balanced
    // Returns -1 if unbalanced
    int check(Node root) {

        // Base case
        if (root == null)
            return 0;

        // Left subtree height
        int left = check(root.left);

        // If left subtree unbalanced
        if (left == -1)
            return -1;

        // Right subtree height
        int right = check(root.right);

        // If right subtree unbalanced
        if (right == -1)
            return -1;

        // Check current node balance
        if (Math.abs(left - right) > 1)
            return -1;

        // Return height
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        balancedTree tree = new balancedTree();

        /*
                  1
                 / \
                2   3
               / \   \
              4   7   6
             /
            5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(7);

        root.right.right = new Node(6);

        root.left.left.left = new Node(5);

        // Check balanced or not
        if (tree.isBalanced(root))
            System.out.println("Tree is Balanced");
        else
            System.out.println("Tree is NOT Balanced");
    }
}