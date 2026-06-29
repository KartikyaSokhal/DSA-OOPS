package LinkedList;

// File: kthfromlast.java



public class kthfromlast {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // WRITE YOUR FUNCTION HERE
    static Node findNLast(Node head, int n){
        if (head==null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        for (int i=0;i<n;i++){
            if (fast==null){
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                return temp;
            }
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void printNode(Node node) {

        if (node == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println(node.data);
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        Node ans = findNLast(head, n);

        printNode(ans);
    }
}