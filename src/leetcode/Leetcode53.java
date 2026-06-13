package leetcode;

import java.util.ArrayList;

public class Leetcode53 {
    static void main() {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxOldStreak = nums[0];
        int currentStreak = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            currentStreak = Math.max(nums[i], currentStreak + nums[i]);
            maxOldStreak = Math.max(maxOldStreak, currentStreak);
        }
        System.out.println(maxOldStreak);
    }
}
