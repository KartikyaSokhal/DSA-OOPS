package Hashing;

import java.util.HashSet;

public class hash_set {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("DragonFruit");
        fruits.add("PineApple");


        // size of hashset
        int size = fruits.size();

        System.out.println(size);

        // ==== ITERATION

//        System.out.println("\n--- Iterating using for-each ----");
//        for (String fruit : fruits) {
//            System.out.println("Fruit: " + fruit);
//        }
//
//        System.out.println("\n--- iterating using iterator --");
//        Iterator<String> interator = fruits.iterator();
//        while(interator.hasNext()){
//            System.out.println("Fruit: " + interator.next());
//        }

        fruits.remove("Apple");

        System.out.println("\n--- Iterating using for-each ----");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        fruits.removeAll(fruits);

        System.out.println("\n--- after removeAll ----");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

    }


}
