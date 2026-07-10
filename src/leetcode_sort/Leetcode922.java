package leetcode_sort;

import java.util.Arrays;

public class Leetcode922 {
    static void main() {
        int nums[] = {1,2,3,4,5,6};
        indices(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] indices(int[] nums){
        int even = 0;
        int odd = 1;
        int n = nums.length;
        while (even < n && odd < n) {
            // If the even index already has an even number, advance by 2
            if (nums[even] % 2 == 0) {
                even += 2;
            }
            // If the odd index already has an odd number, advance by 2
            else if (nums[odd] % 2 != 0) {
                odd += 2;
            }
            // Both pointers are stuck on misplaced numbers -> Swap them!
            else {
                swap(nums, even, odd);
//                even += 2;
//                odd += 2;
            }
        }
        return nums;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}