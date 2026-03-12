package bytee;

public class unique_no {
    public static int unique(int[] arr){
        int xor = 0;
        for (int i =0;i<arr.length;i++){
            xor ^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        System.out.println(unique(arr));
    }
}
