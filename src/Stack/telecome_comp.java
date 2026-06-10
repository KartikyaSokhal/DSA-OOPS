package Stack;

import java.util.*;

public class telecome_comp {
    static long collectData(int[] height){
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int ans[] = new int[n];
        for (int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=height[i]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i] = -1;
            }
            else {
                ans[i] = st.peek();
            }
            st.push(height[i]);
        }

        int sum = 0;
        for (int i=0;i<n;i++){
            sum+= ans[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)

            arr[i] = sc.nextInt();

        System.out.println(collectData(arr));

    }
}
