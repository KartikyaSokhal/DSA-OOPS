package LinkedList;

// File: specialemployee.java

public class specialemployee {

    static class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    // WRITE YOUR FUNCTION HERE
    static Node specialEmployee(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                Node temp = head;
                Node temp2 = slow;
                while(temp!=temp2){
                    temp = temp.next;
                    temp2 = temp2.next;
                }

                return temp;
            }
        }

        return null;

    }

    public static void printNode(Node node) {

        if (node == null) {
            System.out.println("-1");
            return;
        }

        System.out.println(node.name);
    }

    public static void main(String[] args) {

        // Rajesh -> Shivam -> Aman -> Karan -> Seema
        Node head = new Node("Rajesh");

        head.next = new Node("Shivam");
        head.next.next = new Node("Aman");
        head.next.next.next = new Node("Karan");
        head.next.next.next.next = new Node("Seema");

        // Make Seema point to Aman
        head.next.next.next.next.next = head.next.next;

        Node ans = specialEmployee(head);

        printNode(ans);
    }
}
