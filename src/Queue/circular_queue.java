package Queue;

public class circular_queue {
    int size;
    int[] queue;
    int front = -1;
    int rear = -1;
    circular_queue(int size) {
        this.size = size;
        this.queue = new int[size];

    }
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = data;
        if (front == -1) {
            front = rear;
        }
    }
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return data;
    }
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        circular_queue cq = new circular_queue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.display();
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        cq.display();
        cq.enqueue(6);
        cq.enqueue(7);
        cq.display();
    }

}
