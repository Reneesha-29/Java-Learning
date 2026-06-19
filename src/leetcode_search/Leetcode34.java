package leetcode_search;

import java.util.Arrays;

public class Leetcode34 {
    static void main() {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(nums, target)));
    }
    static int[] search(int nums[], int target){
        int[] ans = {-1, -1};

        if (nums.length == 0) {
            return ans;
        }

        // 1. Find the first (leftmost) position
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans[0] = mid;     // Save the potential start position
                end = mid - 1;    // Force the loop to keep looking LEFT
            }
        }

        // 2. Find the last (rightmost) position
        start = 0;
        int end2 = nums.length - 1; // Reset end pointer for the second search
        while (start <= end2) {
            int mid = start + (end2 - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end2 = mid - 1;
            } else {
                ans[1] = mid;     // Save the potential end position
                start = mid + 1;  // Force the loop to keep looking RIGHT
            }
        }

        return ans;
    }
}