package leetcode_arrays;

import java.util.Arrays;

public class Leetcode1920 {
    static void main() {
        int nums[] = {0, 2, 1, 5, 3, 4};
        int n = nums.length;
        int ans[] = new int[n];
        for(int i =0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
