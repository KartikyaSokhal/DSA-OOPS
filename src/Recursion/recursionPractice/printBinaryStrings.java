package recursionPractice;
import java.util.*;

public class printBinaryStrings {
    public static void binary(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        binary(n-1,ans+"0");
        binary(n-1,ans+"1");
    }

    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         binary(n,"");
    }
}
