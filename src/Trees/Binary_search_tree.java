package Trees;

public class BST_search {
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

    static boolean search (Node root, int key){
        if (root==null) return false;

        if (root.data==key) return true;
        else if (key<root.data){
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
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

        System.out.println("Searching " + key1 + " : " + search(root, key1));

        System.out.println("Searching " + key2 + " : " + search(root, key2));

    }
}
