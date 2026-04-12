package Stack;

import java.util.Stack;

public class next_greater_circular {
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int n = arr.length;
        int[] res = new int[n];
        Stack <Integer> st = new Stack<>();
//        for (int i=2*n-1;i>=0;i--){
//            int idx = i%n;
//            while(!st.isEmpty() && arr[st.peek()] <= arr[idx]){
//                st.pop();
//            }
//            if (i<n) {
//                if (st.isEmpty()) {
//                    res[i] = -1;
//                }
//                else {
//                    res[i] = arr[st.peek()];
//                }
//            }
//            st.push(idx);
//        }

        for (int i=n-1;i>=0;i--){
            st.push(arr[i]);
        }

        for (int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
}
