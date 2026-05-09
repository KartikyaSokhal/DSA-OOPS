package recursionPractice;
import java.util.*;

public class productOfDigits {
//    public static int product(int n)
//    {
//        if(n<10)
//        {
//            return n;
//        }
//
//        return product(n/10)*(n%10);
//    }


    public static int product(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return helper(n);
    }

    public static int helper(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return helper(n/10)*(n%10);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(product(n));
    }
}
