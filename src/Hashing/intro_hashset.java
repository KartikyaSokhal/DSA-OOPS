package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class intro_hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(4);

        System.out.println(set.size());
        System.out.println(set.contains(5));
        set.remove(4);
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
