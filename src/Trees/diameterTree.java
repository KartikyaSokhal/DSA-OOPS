package Trees;

public class diameterTree {
    static class Node {
        int data;
        Node left, right;
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int height(Node root){
        if (root==null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right) + 1;
    }

    // time complexity if O(n^2)
    static int diameter1(Node root){
        if (root==null) return 0;

        int leftdia = diameter1(root.left);
        int leftheight = height(root.left);
        int rightdia = diameter1(root.right);
        int rightheight = height(root.right);

        int selfdia = leftheight + rightheight + 1;

        return Math.max(selfdia, Math.max(leftdia,rightdia));
    }

//    static int diameter2(Node root){
//        if (root==null) return 0;
//
//        int leftdia = diameter2(root.left);
//
//    }



    public static void main(String[] args) {

        diameterTree tree = new diameterTree();

        /*
                 1
               /   \
              2     3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(diameter1(root));

    }
}