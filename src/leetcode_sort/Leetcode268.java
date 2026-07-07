package leetcode_sort;

import java.util.Arrays;

public class Leetcode268 {
    static void main() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missing = cyclic(nums);
        System.out.println(missing);
    }
    static int cyclic(int[] nums){
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            int current = nums[i];
            if(nums[i]<n && nums[i] != nums[current]){
                swap(nums, i, current);
                i--;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
