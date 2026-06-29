package Recursion;
import java.util.Scanner;
public class recurrance_relation {

    public static int T(int k){
        if (k==0) return 0;
        return T(k-1) + 3*k;
    }
    public static int TT(int k){
        if (k==0) return 1;
        return TT(k-1) + 2*k;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int k = sc.nextInt();

            System.out.println(TT(k));

        }
    }
}
