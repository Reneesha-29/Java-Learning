package leetcode_arrays;

import java.util.Arrays;

public class Leetcode1470 {
    static void main() {
        int nums[] = {2,5,1,3,4,7};
        int n = (nums.length)/2;
        int ans[] = new int[2*n];
        for(int i =0; i<n; i++){
//            ans[0] = nums[0];
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
    }

}
