package Stack;

public class celebrity_problem {
    public static int celeb(int[][] arr, int n){
        int a = 0;
        int b = n-1;
        while(a<b){
            if (arr[a][b]==1){
                a++;
            } else {
                b--;
            }
        }
        int candidate = a;
        for (int i=0;i<n;i++){
            if (i!=candidate){
                if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        int[][] arr = {{0,1,0},{0,0,0},{1,1,0}};
        int n = 3;
        System.out.println(celeb(arr,n));
    }
}
