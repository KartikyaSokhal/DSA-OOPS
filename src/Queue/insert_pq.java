package Queue;

import java.util.ArrayList;

public class insert_pq {
    static class heap{
        ArrayList<Integer> list = new ArrayList<>();
        public void insert(int data){
            list.add(data);

            int x = list.size()-1;
            int parent = (x-1)/2;

            while(list.get(x) < list.get(parent)){
                int temp = list.get(x);
                list.set(x,list.get(parent));
                list.set(parent,temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public void printHeap() {

            System.out.println(list);

        }
    }

    public static void main(String[] args){
        heap h = new heap();

        h.insert(10);

        h.insert(5);

        h.insert(30);

        h.insert(2);

        h.insert(8);

        h.printHeap();
    }
}
