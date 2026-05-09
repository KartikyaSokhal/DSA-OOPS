package recursionPractice;
import java.util.*;

public class countDigits {
    static int count=0;
    public static int count(int n)
    {
        if(n==0)
        {
            return 1;
        }

        count++;
        return count(n/10);
    }

    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         count(n);
         System.out.print(count);
    }
}
