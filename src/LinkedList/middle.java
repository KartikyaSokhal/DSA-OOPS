package LinkedList;

// File: middle.java



public class middle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // WRITE YOUR FUNCTION HERE
    static Node findMiddle(Node head){
        if (head==null) return null;
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
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

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node ans = findMiddle(head);

        printNode(ans);
    }
}
