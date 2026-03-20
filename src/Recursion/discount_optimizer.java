package Recursion;
import java.util.*;
public class discount_optimizer {
    // e-commerce discount optimizer (recursion + choice)

//    An online store gives discount coupons.
//    Each coupon reduces price by a certain value.
//    You must find the minimum payable price by choosing any subset of coupons.

//    Sample Input
//        500
//        3
//        50 100 30
//    Sample Output
//        320
//
//    Explanation
//    Use all coupons → 500 − (50+100+30) = 320
//          Test Case
//        Input
//          1000
//          2
//          100 200
//         Output
//          700

    public static int sum(int[] arr, int i){
        if (i==arr.length) return 0;
        return arr[i] + sum(arr,i+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
        int cut = sum(arr, 0);
        int minimum_pay = total-cut;
        System.out.println(minimum_pay);

    }
}
