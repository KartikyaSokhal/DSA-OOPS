package Recursion;

public class primefactors {
    public static void main(String[] args){

        int n = 60;
        // brute force giving time complexity O(n)
        int divisor = 2;
        while(n>1){
            if (n%divisor==0){
                System.out.print(divisor + " ");
                n /=divisor;
            } else {
                divisor++;
            }
        }

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
    }
}
