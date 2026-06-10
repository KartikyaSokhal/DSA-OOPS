package ST2_PRACTICE;

import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class merge_LL {

    // Merge two sorted linked lists
    static Node mergeLists(Node head1, Node head2) {
        if (head1==null) return head2;
        if (head2==null) return head1;

        Node t1 = head1;
        Node t2 = head2;

        Node dummy = new Node(-1);
        Node curr = dummy;


        while(t1!=null && t2!=null){
            if (t1.data<t2.data) {
                curr.next = t1;
                t1 = t1.next;
            } else {
                curr.next = t2;
                t2 = t2.next;
            }
            curr = curr.next;
        }

        if (t1!=null){
            curr.next = t1;
        }
        if (t2!=null){
            curr.next = t2;
        }

        return dummy.next;

    }

    // Create linked list
    static Node createList(Scanner sc, int n) {

        if (n == 0)
            return null;

        Node head = new Node(sc.nextInt());
        Node curr = head;

        for (int i = 1; i < n; i++) {

            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }

        return head;
    }

    // Print linked list
    static void printList(Node head) {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First list size
        int n = sc.nextInt();

        // First sorted linked list
        Node head1 = createList(sc, n);

        // Second list size
        int m = sc.nextInt();

        // Second sorted linked list
        Node head2 = createList(sc, m);

        // Merge
        Node mergedHead = mergeLists(head1, head2);

        // Print merged list
        printList(mergedHead);
    }
}