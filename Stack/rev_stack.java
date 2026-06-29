package Stack;
import java.util.*;
public class rev_stack {
    public static void push_bottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        push_bottom(s,data);
        s.push(top);
    }
    public static void rev(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        rev(s);
        push_bottom(s,top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);


        rev(st);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
