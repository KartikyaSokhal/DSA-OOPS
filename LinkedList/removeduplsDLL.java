package LinkedList;

// File: removeDupsDLL.java

public class removeduplsDLL {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node removeDupsDLL(Node head){
        if (head==null) return null;

        Node curr = head;
        while(curr!=null && curr.next!=null){
            if (curr.data==curr.next.data){
                Node temp = curr.next;
                curr.next = temp.next;
                if (temp.next!=null){
                    temp.next.prev = curr;
                }
            }
            else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 <-> 3 <-> 3 <-> 4 <-> 5 <-> 5 <-> 5 <-> 7 <-> 9 <-> 9 <-> 9 <-> 9

        Node head = new Node(1);

        head.next = new Node(3);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        head.next.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next.prev =
                head.next.next.next.next.next.next;

        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.prev =
                head.next.next.next.next.next.next.next;

        head.next.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next.prev =
                head.next.next.next.next.next.next.next.next;

        head.next.next.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next.next.prev =
                head.next.next.next.next.next.next.next.next.next;

        head.next.next.next.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next.next.next.prev =
                head.next.next.next.next.next.next.next.next.next.next;

        System.out.println("Original DLL:");
        printList(head);

        head = removeDupsDLL(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}