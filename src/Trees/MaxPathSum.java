package Trees;

public class MaxPathSum {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    int maxSum = Integer.MIN_VALUE;

    // Function to calculate maximum path sum
    int maxPath(Node root) {

        // Base case
        if (root == null)
            return 0;

        // Ignore negative paths
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));

        // Path passing through current node
        maxSum = Math.max(maxSum, left + right + root.data);

        // Return single path to parent
        return root.data + Math.max(left, right);
    }

    // Wrapper function
    int maxPathSum(Node root) {
        maxPath(root);
        return maxSum;
    }

    public static void main(String[] args) {

        MaxPathSum tree = new MaxPathSum();

        /*
                  10
                 /  \
                2    10
               / \     \
              20  1    -25
                        /  \
                       3    4
        */

        Node root = new Node(10);

        root.left = new Node(2);
        root.right = new Node(10);

        root.left.left = new Node(20);
        root.left.right = new Node(1);

        root.right.right = new Node(-25);

        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println("Maximum Path Sum = " + tree.maxPathSum(root));
    }
}