package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class first_negative {
    public static void main(String[] args){
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int n = arr.length;
        int[] result = new int[n];

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() == i-k){
                dq.pop();
            }

            if (arr[i] < 0) {
                dq.addLast(i);
            }
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    System.out.println(arr[dq.peekFirst()]);
                } else {
                    System.out.println(0);
                }
            }
        }

    }
}
