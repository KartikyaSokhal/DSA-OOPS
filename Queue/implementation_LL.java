package Queue;

public class implementation_LL {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int item){
            Node newNode = new Node(item);

            if (isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if (isEmpty()){
                return -1;
            }

            int val = head.data;

            if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }

            return val;
        }

        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}