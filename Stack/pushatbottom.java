package Stack;

import java.util.Stack;

public class pushatbottom {
    public static void push_bottom(Stack<Integer> s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        push_bottom(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        push_bottom(st,4);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
