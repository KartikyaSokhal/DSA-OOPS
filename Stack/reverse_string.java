package Stack;

import java.util.Stack;

public class reverse_string {
    public static void main(String[] args){
        String s = "abcdef";
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            st.push(ch);
        }
        StringBuilder rev = new StringBuilder("");
        while(!st.isEmpty()){
            rev.append(st.pop());
        }

        System.out.println(rev.toString());
    }
}
