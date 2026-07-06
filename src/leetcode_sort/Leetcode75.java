package leetcode_sort;

import java.util.Arrays;

public class Leetcode75 {
    static void main() {
        int nums[] = {4,2,1,3};
//        insertion(nums);
//        bubble(nums);
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    //SELECTION SORT
    static void selection(int[] nums){
        for(int i=0; i<nums.length; i++){
            int last = nums.length - 1 - i;
            int maxx = getmax(nums, 0, last);
            swap(nums, maxx, last);
        }
    }
    static int getmax(int[] nums, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(nums[max]<nums[i]){
                max = i;
            }
        }
        return max;
    }

    //BUBBLE SORT
//    static void bubble(int[] nums){
//        boolean swapped = true;
//        for(int i=0; i<nums.length; i++){
//            swapped = false;
//            for(int j=1; j<nums.length-i; j++){
//                if(nums[j]<nums[j-1]){
//                    swap(nums, j, j-1);
//                    swapped = true;
//                }
//            }
//            if(swapped = false){
//                break;
//            }
//        }
//    }


    //INSERTION SORT
//    static void insertion(int[] nums){
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j>0; j--){
//                if(nums[j] < nums[j-1]){
//                    swap(nums, j, j-1);
//                }
//                else{
//                    break;
//                }
//            }
//        }
//    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;

    }
}
