package Trees;

class node1 {

    int data;
    node1 left, right;

    node1(int data) {
        this.data = data;
    }
}

public class mirror {

    static node1 mirror(node1 root) {

        // Base case
        if (root == null)
            return null;

        // Mirror left subtree
        node1 left = mirror(root.left);

        // Mirror right subtree
        node1 right = mirror(root.right);

        // Swap
        root.left = right;
        root.right = left;

        return root;
    }

    // Inorder traversal
    static void inorder(node1 root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        node1 root = new node1(1);

        root.left = new node1(2);
        root.right = new node1(3);

        root.left.left = new node1(4);
        root.left.right = new node1(5);

        /*
                 1
               /   \
              2     3
             / \
            4   5
        */

        System.out.println("Original Tree (Inorder):");
        inorder(root);

        mirror(root);

        System.out.println("\nMirror Tree (Inorder):");
        inorder(root);
    }
}