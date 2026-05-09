package recursionPractice;
import java.util.*;

public class numberPalindrome {
    static int rev=0;
    public static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }

        int ld=n%10;
        rev=rev*10+ld;
        reverse(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
        if(n==rev)
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("not palindrome");
        }
    }
}
