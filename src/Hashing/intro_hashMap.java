package Hashing;

import java.util.*;


public class intro_hashMap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 1);
        map.put("China", 2);
        map.put("USA", 3);

//        System.out.print(map.get("India"));
//
//        for (Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        for (String i: map.keySet()){
            System.out.println(i + " " + map.get(i));
        }
    }
}
