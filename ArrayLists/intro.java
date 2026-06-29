package ArrayLists;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1); // O(1)
//        list.add(2); // O(1)
//        list.add(2,9); // O(n)
//        list.remove(1);
//        list.get(0);
//        list.contains(9);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }


        for (int i=1;i<=10;i++){
            list.add(i);
        }

        System.out.print(list);



    }
}
