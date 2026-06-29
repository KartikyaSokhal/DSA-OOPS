package ArrayLists;

import java.util.ArrayList;

public class two_sum {
//    public static boolean sum(ArrayList<Integer> list, int k){
//        int left = 0;
//        int right = list.size()-1;
//        while(left<right){
//            int sum = list.get(left) + list.get(right);
//            if (sum==k){
//                return true;
//            }
//            if (sum<k){
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return false;
//    }

    // for sorted and rotated array

    public static boolean sum(ArrayList<Integer> list, int k){
        int breakpoint = -1;
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i) > list.get(i+1)){
                breakpoint = i;
                break;
            }
        }
        int left = breakpoint+1;
        int right = breakpoint;

        while(left!=right){
            int sum = list.get(left) + list.get(right);
            if (sum==k){
                return true;
            }
            if (sum<k){
                left = (left+1)%list.size();
            } else {
                right = (right+list.size()-1)%list.size();
            }
        }

        return false;
    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(2);
        list.add(4);
        list.add(8);

        int k = 17;
        System.out.print(sum(list,k));
    }
}
