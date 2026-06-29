package ArrayLists;

import java.util.ArrayList;

public class arraylist_basic {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add(45);
        list.add("java");
        list.add(56.56);
        list.add(false);

        System.out.print(list);
        System.out.println();

        for (Object k : list) {
            System.out.println(k + " ");
        }
    }
}
