package LinkedList;

// File: mergepoint.java

import java.util.HashSet;



public class mergepoint {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // WRITE YOUR FUNCTION HERE
    static Node findMergePoint(Node head1, Node head2){
        HashSet<Node> set = new HashSet<>();
        Node t1 = head1;
        while(t1!=null){
            set.add(t1);
            t1 = t1.next;
        }

        Node t2 = head2;
        while(t2!=null){
            if (set.contains(t2)){
                return t2;
            }
            t2 = t2.next;
        }

        return null;
    }



    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Common part
        Node common = new Node(5);
        common.next = new Node(6);

        // First List: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = common;

        // Second List: 8 -> 7 -> 5 -> 6
        Node head2 = new Node(8);
        head2.next = new Node(7);
        head2.next.next = common;

        Node ans = findMergePoint(head1, head2);

        if (ans != null) {
            printList(ans);
        } else {
            System.out.println("No merge point");
        }
    }
}