package Queue;

import java.util.Stack;

public class next_smaller {
    public static void main(String[] args){
        int [] arr = {4,5,2,10};
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
    }
}
