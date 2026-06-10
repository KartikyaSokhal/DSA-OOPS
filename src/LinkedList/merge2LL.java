package LinkedList;

// File: merge2LL.java



public class merge2LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // WRITE YOUR FUNCTION HERE
    static Node merge(Node head1, Node head2){

        if (head1==null) return head2;
        if (head2==null) return head1;
        Node t1 = head1;
        Node t2 = head2;

        Node dummy = new Node(-1);
        Node curr = dummy;
        while(t1!=null && t2!=null){
            if (t1.data<t2.data){
                curr.next = t1;
                t1 = t1.next;
            }
            else{
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

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5 -> 7
        Node head1 = new Node(1);

        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        // List 2: 2 -> 4 -> 6
        Node head2 = new Node(2);

        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node ans = merge(head1, head2);

        printList(ans);
    }
}
