package Queue;

import java.util.Collections;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> q = new java.util.PriorityQueue<>(Collections.reverseOrder());

        q.add(2);
        q.add(7);
        q.add(3);
        q.add(0);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }

}
