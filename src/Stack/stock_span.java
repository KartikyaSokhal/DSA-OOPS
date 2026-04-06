package Stack;

import java.util.Stack;

public class stock_span {
    public static int[] stock(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()){
                result[i] = i+1;
            } else {
                int prevhigh = st.peek();
                result[prevhigh] = i-prevhigh;
            }
            st.push(i);
        }

        return result;
    }
    public static void main(String[] args){

    }
}
