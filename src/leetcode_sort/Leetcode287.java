package leetcode_sort;

import java.util.ArrayList;

public class Leetcode287 {
    static void main() {
        int nums[] = {3,4,1,2,4};
        int duplicate = cyclic(nums);
        System.out.println(duplicate);
    }
    static int cyclic(int[] nums){
//        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            int index = nums[i]-1;
            if(nums[i]<n && nums[i]!= nums[index]){
                swap(nums, i, index);
                i--;
            }
        }
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]!=i+1){
//                list.add(i+1);
//            }
//        }
//        return list;
        return nums[n-1];
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
