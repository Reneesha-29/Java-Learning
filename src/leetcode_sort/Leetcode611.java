package leetcode_sort;

import java.util.Arrays;

public class Leetcode611 {
    static void main() {
        int[] nums = {2,2,3,4};
        int total = valid(nums);
        System.out.println(total);
    }
    static int valid(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for(int i=n-1; i>=2; i--){
            int left = 0;
            int right = i-1;
            while(left<right){
                if(nums[left] + nums[right] > nums[i]){
                    count += (right - left);
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}
