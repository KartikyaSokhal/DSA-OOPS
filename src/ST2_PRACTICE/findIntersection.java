package ST2_PRACTICE;

import java.util.*;

class Main {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find sorted intersection
    public static Node findIntersection(Node head1, Node head2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> common = new ArrayList<>();

        if (head1 == null || head2 == null) {
            return null;
        }

        Node temp = head1;

        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        temp = head2;

        while (temp != null) {

            if (set.contains(temp.data)) {
                common.add(temp.data);

                // duplicate avoid karne ke liye
                set.remove(temp.data);
            }

            temp = temp.next; 
        }

        Collections.sort(common);

        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int val : common) {
            curr.next = new Node(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    // Insert node at end
    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Print linked list
    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of nodes in first list
        int n = sc.nextInt();

        Node head1 = null;

        // Input first list
        for (int i = 0; i < n; i++) {
            head1 = insert(head1, sc.nextInt());
        }

        // Number of nodes in second list
        int m = sc.nextInt();

        Node head2 = null;

        // Input second list
        for (int i = 0; i < m; i++) {
            head2 = insert(head2, sc.nextInt());
        }

        // Find intersection
        Node result = findIntersection(head1, head2);

        // Print result
        printList(result);

        sc.close();
    }
}