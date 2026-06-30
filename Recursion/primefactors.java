package Recursion;

public class primefactors {
    // recursion brute force giving time complexity O(n)
    public static void primefact(int n, int divisor){
        if (n==1){
            return;
        }
        if (n%divisor==0){
            System.out.print(divisor+" ");
            primefact(n/divisor,divisor);
        } else {
            primefact(n,divisor+1);
        }
    }
    // optimized solution for prime factors giving time complexity O(root n)
    public static void primefactoptimized(int n, int divisor){
        if (n==1){
            return;
        }
        if (divisor*divisor>n){
            return;
        }
        if (n%divisor==0){
            System.out.print(divisor+" ");
            primefact(n/divisor,divisor);
        } else {
            primefact(n,divisor+1);
        }
    }

    // more optimized
    public static void primefactoptimized_2nd(int n, int divisor){
        if (n==1){
            return;
        }
        if (divisor*divisor>n){
            return;
        }
        if (n%divisor==0){
            System.out.print(divisor+" ");
            primefact(n/divisor,divisor);
        } else {
            if (divisor==2){
                primefact(n,divisor+1);
            } else {
                primefact(n,divisor+2);
            }
        }
    }
    public static void main(String[] args){

        int n = 60;
//        // brute force giving time complexity O(n)
//        int divisor = 2;
//        while(n>1){
//            if (n%divisor==0){
//                System.out.print(divisor + " ");
//                n /=divisor;
//            } else {
//                divisor++;
//            }
//        }

        // ----------------------------------------------------------------------------------------------------

//        // optimized solution for prime factors giving time complexity O(root n)
//        for (int i=2;i*i<=n;i++){
//            while (n%i==0){
//                System.out.print(i + " ");
//                n /= i;
//            }
//        }
//        if (n>1){
//            System.out.print(n);
//        }
        // ----------------------------------------------------------------------------------------------------

        // recursion call
        primefactoptimized(n,2);
    }
}
