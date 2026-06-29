package Queue;

import java.util.*;

public class circular_queue {

    int[] arr = new int[100];

    int front = -1;

    int rear = -1;

    int size = 100;

    void enqueue(int x){

        if ((rear+1)%size == front){
            System.out.println("-2");
            return;
        }
        if (front==-1){
            front=rear=0;
        } else {
            rear = (rear+1)%size;
        }

        arr[rear] = x;
    }


    int dequeue(){
        if (front==-1){
            return -1;
        }

        int val = arr[front];



        if (front==rear){
            front=rear=-1;
        } else {
            front=(front+1)%size;
        }

        return val;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        circular_queue cq = new circular_queue();

        while(q-- > 0){

            int type = sc.nextInt();

            if(type == 1){

                int x = sc.nextInt();

                cq.enqueue(x);

            }

            else{

                System.out.print(cq.dequeue()+" ");

            }

        }
    }
}
