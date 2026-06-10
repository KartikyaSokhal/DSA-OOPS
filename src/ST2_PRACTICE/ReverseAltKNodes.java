package ST2_PRACTICE;

public class ReverseAltKNodes {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    static Node reverseAltKNodes(Node head, int k){
//
//        if (head==null || k<=1){
//            return head;
//        }
//
//        Node curr = head;
//        Node next;
//        Node prev = null;
//        int count = 0;
//        while(curr!=null && count<k){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            count++;
//        }
//
//        head.next = curr;
//
//        count = 1;
//
//        Node temp = curr;
//
//        while(temp!=null && count <k){
//            temp = temp.next;
//            count++;
//        }
//
//        if (temp!=null){
//            temp.next = reverseAltKNodes(temp.next,k);
//        }
//
//
//        return prev;
//
//    }

    static Node reverseAltKNodes(Node head, int k){
        if (head==null || k<=1){
            return head;
        }

        Node curr = head;
        Node next;
        Node prev = null;
        int count = 0;
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = curr;

        count = 1;

        Node temp = curr;
        while(temp!=null && count <k){
            temp = temp.next;
            count++;
        }

        if (temp!=null){
            temp.next = reverseAltKNodes(temp.next,k);
        }

        return prev;
    }
    // Linked List class
    static class LinkedList {

        Node head;

        // insert at end
        void insert(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // print list
        void printList() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // FUNCTION TO WRITE
        Node reverseAltKNodes(Node head, int k) {

            // write your code here

            return head;
        }
    }

    // main function
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        System.out.println("Original List:");
        list.printList();

        int k = 3;

        list.head = reverseAltKNodes(list.head, k);

        System.out.println("Modified List:");
        list.printList();
    }
}