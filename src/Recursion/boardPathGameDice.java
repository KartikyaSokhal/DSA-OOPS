package Recursion;
import java.util.*;

public class boardPathGameDice {
    public static void path(int curr,int end,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }

        if(curr>end)
        {
            return;
        }
        for(int dice=1;dice<=6;dice++)
        {
            path(curr+dice,end,ans+dice);
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        path(0,n,"");
    }
}
