package LinkedList;

// File: intersectionLL.java

import com.sun.source.tree.Tree;

import javax.swing.event.TreeSelectionEvent;
import java.util.TreeSet;
import java.util.HashSet;

public class intersectionLL {

    // WRITE YOUR FUNCTION HERE
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node findIntersection(Node head1, Node head2){
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> settt = new TreeSet<>();

        Node t1 = head1;
        Node t2 = head2;

        while(t1!=null){
            set.add(t1.data);
            t1 = t1.next;
        }

        while(t2!=null){
           if (set.contains(t2.data)){
               settt.add(t2.data);
           }
           t2 = t2.next;
        }

        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int val : settt){
            curr.next = new Node(val);
            curr = curr.next;
        }

        return dummy.next;



    }

    public static void printList(Node head) {

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // List 1: 7 -> 1 -> 2 -> 3 -> 4 -> 5
        Node head1 = new Node(7);

        head1.next = new Node(1);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);

        // List 2: 2 -> 4 -> 6 -> 8
        Node head2 = new Node(2);

        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node ans = findIntersection(head1, head2);

        printList(ans);
    }
}
