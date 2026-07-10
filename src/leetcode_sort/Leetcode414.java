package leetcode_sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Leetcode414 {
    static void main() {
        int nums[] = {1,2,3};
        System.out.println(maxthree(nums));
    }
    static int maxthree(int[] nums){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>first){
                first = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>second && nums[i]<first){
                second = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>third && nums[i]<second){
                third = nums[i];
            }
        }
        if(third == Long.MIN_VALUE){
            return (int)(first);
        }
        else{
            return (int)(third);
        }
    }
}