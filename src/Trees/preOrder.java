package Trees;

public class preOrder {
     static class Node{
         int data;
         Node left;
         Node right;
         Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
     static class BinaryTree{
         static int idx = -1;
         public static Node builder(int[] node){
             idx++;
             if (node[idx] == -1) return null;

             Node newNode = new Node(node[idx]);
             newNode.left = builder(node);
             newNode.right = builder(node);

             return newNode;
         }
         public static void preOrder(Node root){
             if (root == null) {
                 System.out.print("-1" + " ");
                 return;
             }
             System.out.print(root.data + " ");
             preOrder(root.left);
             preOrder(root.right)  ;
         }

     }
     public static void main(String[] args){
         BinaryTree tree = new BinaryTree();
         int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Node root = tree.builder(node);
         System.out.println(root.data);

         tree.preOrder(root);
     }
}
