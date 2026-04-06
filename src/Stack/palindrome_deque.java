package Stack;
import java.util.*;
public class palindrome_deque {
    public static void main(String[] args){
        String s = "m";
        Deque <Character> dq = new ArrayDeque<>();
        for (int i=0;i<s.length();i++){
            dq.addLast(s.charAt(i));
        }
        while(!dq.isEmpty()){
            if (dq.peekFirst()!= dq.peekLast()){
                System.out.println("not Palindrome");
                break;
            } else if (dq.size()==1){
                break;
            } else {
                dq.removeLast();
                dq.removeFirst();
            }
        }

        if (dq.isEmpty() || dq.size() ==1){
            System.out.println("palindrome");
        }
    }
}
