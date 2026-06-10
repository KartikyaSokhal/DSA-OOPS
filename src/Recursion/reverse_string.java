package Recursion;

import java.util.Scanner;

public class reverse_string {
    public static void reverse(String s, int k){
        if (k<0) return;

        System.out.print(s.charAt(k));
        reverse(s,k-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverse(s,s.length()-1);
    }
}
