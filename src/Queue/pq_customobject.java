package Queue;

import java.util.PriorityQueue;

public class pq_customobject {
     static class Students implements Comparable<Students>{
        String name;
        int rank;

        Students(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
         public int compareTo(Students s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args){
        PriorityQueue<Students> pq = new PriorityQueue<>();

        pq.add(new Students("k", 2));
        pq.add(new Students("r", 1));
        pq.add(new Students("t", 4));
        pq.add(new Students("n", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);
            pq.remove();
        }

    }
}
