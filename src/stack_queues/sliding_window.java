package stack_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class sliding_window {
    public static void main(String[] args){
        int arr[] = {10,-3,2,40,20,30,10,5};
        int k = 3;

        Deque <Integer> dq = new ArrayDeque<>();

        for (int i=0;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }

            dq.add(i);

            if (i>=k-1){
                System.out.println(arr[dq.peekFirst()]);
            }
        }
    }
}
