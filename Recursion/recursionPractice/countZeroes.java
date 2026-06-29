package recursionPractice;
import java.util.*;

public class countZeroes {
    static int zeroes=0;
    public static void count(int n)
    {
        if(n==0)
        {
            return;
        }

        int ld=n%10;
        if(ld==0) zeroes++;
        count(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n);
        System.out.print(zeroes);
    }
}
