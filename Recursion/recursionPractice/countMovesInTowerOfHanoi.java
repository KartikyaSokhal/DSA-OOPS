package recursionPractice;
import java.util.*;

public class countMovesInTowerOfHanoi {
    static int count=0;
    public static void countTower(int n,char src,char helper,char dest)
    {
        if(n==0)
        {
            return;
        }

        countTower(n-1,src,dest,helper);
        count++;
        countTower(n-1,helper,src,dest);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countTower(n,'A','B','C');
        System.out.print(count);
    }
}
