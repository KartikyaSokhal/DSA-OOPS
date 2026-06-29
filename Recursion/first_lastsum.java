package Recursion;
import java.util.*;

public class first_lastsum {
    static int firstDigit(int n) {
        if (n<10){
            return n;
        }
        return firstDigit(n/10);
    }

    static int sumOfDigits(int n){
        int first = firstDigit(n);
        int last = n%10;

        return first+last;
    }

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));

    }
}
