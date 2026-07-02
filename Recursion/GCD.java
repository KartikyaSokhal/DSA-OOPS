package Recursion;



public class GCD {
    public static int gcdfunc(int a, int b){
        if (b==0) return a;
        return gcdfunc(b,a%b);
    }
    public static void main(String[] args){

        int a = 12;
        int b = 18;

        // recursion call
        System.out.println(gcdfunc(a,b));

        // brute force approach giving complexity O(n)
        for (int i = Math.min(a,b);i>=1;i--){
            if (a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }

        // Euelidean algo using iteration
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        System.out.println(a);


    }
}
