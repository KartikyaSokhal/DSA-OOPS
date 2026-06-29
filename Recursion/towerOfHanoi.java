package Recursion;
import java.util.*;

public class towerOfHanoi
{
    public static void tower(int n,char src,char helper,char dest)
    {

        if(n==0)
        {
            return;
        }

        tower(n-1,src,dest,helper);
        System.out.println(src+"->"+dest);
        tower(n-1,helper,src,dest);


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tower(n,'A','B','C');
    }
}