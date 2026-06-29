package ST2_PRACTICE;

class findUnion {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Function to find sorted union
//    static Node findUnion(Node head1, Node head2) {
//
//        java.util.HashSet<Integer> set = new java.util.HashSet<>();
//
//        Node temp = head1;
//        while (temp != null){
//            set.add(temp.data);
//            temp = temp.next;
//        }
//
//        temp = head2;
//        while(temp!=null){
//            set.add(temp.data);
//            temp = temp.next;
//        }
//
//        java.util.ArrayList<Integer> union = new java.util.ArrayList<>(set);
//
//        java.util.Collections.sort(union);
//
//        Node dummy = new Node(-1);
//        Node curr = dummy;
//
//        for (int val : union){
//            curr.next = new Node(val);
//            curr = curr.next;
//        }
//
//        return dummy.next;
//
//    }
    static Node findUnion(Node head1, Node head2) {

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        Node t1 = head1;

        while(t1!=null){
            set.add(t1.data);
            t1 = t1.next;
        }

        Node t2 = head2;
        while(t2!=null){
            set.add(t2.data);
            t2 = t2.next;
        }

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(set);

        java.util.Collections.sort(list);

        Node dummy = new Node(-1);
        Node curr = dummy;
        for (int val : list){
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

        java.util.Scanner sc =
                new java.util.Scanner(System.in);

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

        // Find union
        Node result = findUnion(head1, head2);

        // Print result
        printList(result);

        sc.close();
    }
}