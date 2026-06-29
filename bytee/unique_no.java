package bytee;

public class unique_no {
    // have to find
    public static int unique(int[] arr){
        int result = 0;

        for (int i =0;i<arr.length;i++){
            result ^= arr[i];
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        System.out.println(unique(arr));
    }
}
