package Recursion;
import java.util.*;

public class lexographicalCounting {
    public static void lexo(int curr, int end) {
        if (curr>end){
            return;
        }
        System.out.print(curr+" ");

        for (int i=1;i<=9;i++){
            lexo(curr*10+i,end);
        }
    }

    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            lexo(j, 34);
        }
    }
}

