package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode448 {
    static void main() {
        int nums[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = cyclic(nums);
        System.out.println(list);
    }
    static ArrayList<Integer> cyclic(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = nums[i]-1;
            if(nums[i]!= nums[index]){
                swap(nums, i, index);
                i--;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
