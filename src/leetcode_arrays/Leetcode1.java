package leetcode_arrays;

import java.util.Arrays;

public class Leetcode1 {
    static void main() {
        int nums[] = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        int ans[] = new int[2];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
