package leetcode_arrays;

import java.util.Arrays;

public class Leetcode41 {
    static void main() {
        int nums[] = {1,2,0};
        int n = nums.length;
        int ans = 1;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if (nums[i] <= 0 || (i > 0 && nums[i] == nums[i-1])) {
                continue;
            }
            if (nums[i] == ans) {
                ans++;
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }
}
