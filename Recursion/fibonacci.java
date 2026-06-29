//Tree recursion
//Tail recursive:  ek hi baar mein stack bhar jaana , and then gets empty at once
// fibonacci is not tail recursive
package Recursion;

import java.util.*;

public class fibonacci {
    public static int fibo(int n)
    {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(fibo(i)+" ");
        }
//        System.out.print(fibo(n));
    }
}
