package Recursion;
import java.util.*;
public class folder_size {
        // folder contains subfolders and file sizes,
    // have to compute total size recursively;

    // sample input 3 | 100 | 200 | 300
    // sample output 600

    public static int sum(int[] arr, int i){
        if (i==arr.length) return 0;
        return arr[i] + sum(arr, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = sum(arr,0);
        System.out.println(total);
    }
}
