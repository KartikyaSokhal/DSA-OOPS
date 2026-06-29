package PQ_Heaps;

import java.util.ArrayList;

public class operations_pq {
    static class heap{
        ArrayList<Integer> list = new ArrayList<>();
        public void insert(int data){
            list.add(data);

            int x = list.size()-1;
            while(x > 0){
                int parent = (x - 1) / 2;
                if(list.get(x) < list.get(parent)){
                    int temp = list.get(x);
                    list.set(x, list.get(parent));
                    list.set(parent, temp);
                    x = parent;
                }
                else{
                    break;
                }
            }
        }

        public void printHeap() {
            System.out.println(list);
        }

        public int peek(){
            return list.get(0);
        }

        public int delete(){
            int data = list.get(0);

            int temp = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            list.remove(list.size()-1);

            heapify(0);

            return data;

        }

        private void heapify(int i){
            int largest = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if (left<list.size() && list.get(left)>list.get(largest)){
                largest = left;
            }
            if (right<list.size() && list.get(right)>list.get(largest)){
                largest = right;
            }

            if (largest!=i){
                int temp = list.get(i);
                list.set(i,list.get(largest));
                list.set(largest,temp);

                heapify(largest);
            }
        }
    }

    public static void main(String[] args){
        heap h = new heap();

        h.insert(10);

        h.insert(20);

        h.insert(30);

        h.insert(5);

        h.insert(8);

        h.printHeap();

        System.out.println(h.peek());

        h.delete();

        h.printHeap();
    }
}
