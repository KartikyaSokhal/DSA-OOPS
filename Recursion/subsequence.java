package Recursion;
import java.util.*;

public class subsequence {
    public static String subseq(String s,String ans)
    {
        if(s.length()==0)
        {
            return ans;
        }

        char ch=s.charAt(0);
        String rem=s.substring(1);
        subseq(rem,ans); //exclude
        subseq(rem,ans+ch); //include

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(subseq(str,""));
    }
}
