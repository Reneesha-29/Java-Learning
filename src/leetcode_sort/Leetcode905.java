package leetcode_sort;

import java.util.Arrays;

public class Leetcode905 {
    static void main() {
        int nums[] = {1,2,3,4,5,6};
        parity(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] parity(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int a = nums[i];
            for(int j=i+1; j<n; j++){
                int b = nums[j];
                if(b % 2 == 0){
                    swap(i, nums, j);
                }
            }
        }
        return nums;
    }
    static void swap(int a, int[] nums, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}