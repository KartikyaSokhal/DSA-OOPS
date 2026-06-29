package Trees;

public class Binary_search_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // search in BST -------------------------------------------------------
    static boolean search (Node root, int key){
        if (root==null) return false;

        if (root.data==key) return true;
        else if (key<root.data){
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Insert in BST ---------------------------------------------------------
    static Node insert(Node root, int key){
        if (root==null) return new Node(key);

        if (key<root.data){
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }
    // delete Node in BST --------------------------------------------------------
    static Node delete(Node root, int key) {
        if(root == null) return null;

        if(key < root.data) {
            root.left = delete(root.left, key);
        } else if(key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // no or 1 children
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            // Two children
            Node min = findMin(root.right);
            root.data = min.data;
            root.right = delete(root.right, min.data);
        }

        return root;
    }

    static Node findMin(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    static void range(Node root, int L, int R){
        if (root==null) return;

        if (root.data>L) range(root.left, L, R);

        if (root.data>= L && root.data <= R){
            System.out.print(root.data + " ");
        }

        if (root.data<R) range (root.right, L, R);
    }

    public static void main(String[] args) {

        /*

                  8

                 / \

                5   10

               / \    \

              3   6    11

         */

        Node root = new Node(8);

        root.left = new Node(5);

        root.right = new Node(10);

        root.left.left = new Node(3);

        root.left.right = new Node(6);

        root.right.right = new Node(11);

        int key1 = 6;

        int key2 = 15;

        // System.out.println("Searching " + key1 + " : " + search(root, key1));

        // System.out.println("Searching " + key2 + " : " + search(root, key2));

        int key3 = 4;



    }
}
