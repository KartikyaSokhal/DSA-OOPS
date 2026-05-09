package Trees;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class diameterTree {

    int diameter = 0;

    // Function to calculate height and update diameter
    int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right); // FIXED: was root.left

        // Update diameter
        diameter = Math.max(diameter, left + right);

        // Return height
        return 1 + Math.max(left, right);
    }

    // Function to get diameter of tree
    int diameterOfTree(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }

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

        int result = tree.diameterOfTree(root);

        System.out.println("Diameter of Tree: " + result);
    }
}