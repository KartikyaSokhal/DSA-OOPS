package Tries;

public class basic {
    static class Node{
        Node children[] = new Node[26];
        boolean isEnd = false;

        Node(){
            for (int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static void insert(String str){
        Node curr = root;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = ch-'a';
            if (curr.children[idx]==null){
                 curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for (int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.isEnd ==true;
    }
    public static void main(String[] args){
    String words[] = {"the", "a", "there", "their" , "any", "thee"};
        for (int i=0;i<words.length;i++){
         insert(words[i]);
        }


        System.out.println(search("thee"));
        System.out.println(search("an"));
    }
}
