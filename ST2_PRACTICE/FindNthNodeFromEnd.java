package ST2_PRACTICE;

public class FindNthNodeFromEnd {

    // Node class

    static class Node {

        int data;

        Node next;

        Node(int data) {

            this.data = data;

            this.next = null;

        }

    }

    // find nth node from end

//    static Node findNLast(Node head, int n) {
//
//        if (head == null) return head;
//
//        Node slow = head;
//        Node fast = head;
//
//        for (int i = 0; i < n; i++) {
//            if (fast == null) {
//                Node temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                return temp;
//            }
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }
    static Node findNLast(Node head, int n) {
        Node slow = head;
        Node fast = head;

        if (head==null || n==0){
            return head;
        }

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


    // insert at end

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

    // print list

    static void printList(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;

        }

        System.out.println();

    }

    public static void main(String[] args) {

        /*

            1 → 2 → 3 → 4 → 5 → 6

        */

        Node head = null;

        head = insert(head, 1);

        head = insert(head, 2);

        head = insert(head, 3);

        head = insert(head, 4);

        head = insert(head, 5);

        head = insert(head, 6);

        System.out.println("Linked List:");

        printList(head);

        int n = 2;

        Node ans = findNLast(head, n);

        if (ans != null) {

            System.out.println("Nth node from end = " + ans.data);

        }

    }

}