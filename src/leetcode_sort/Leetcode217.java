package leetcode_sort;

import java.util.HashSet;

public class Leetcode217 {
    static void main() {
        int nums[] = {1,2,3,1};
        System.out.println(duplicate(nums));
    }
    static boolean duplicate(int[] nums){
        HashSet<Integer> uniq = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(uniq.contains(nums[i])){
                return true;
            }
            uniq.add(nums[i]);
        }
        // No duplicates found
        return false;
    }
}