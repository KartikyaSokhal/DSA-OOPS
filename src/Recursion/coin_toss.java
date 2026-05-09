package Recursion;
import java.util.*;

public class coin_toss {
    public static void coinToss(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        coinToss(n-1,ans+"H");
        coinToss(n-1,ans+"T");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        coinToss(n,"");
    }
}
