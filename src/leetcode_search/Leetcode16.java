package leetcode_search;

import java.util.Arrays;

public class Leetcode16 {
    static void main() {
        int nums[] = {0,1,2};
        int target = 1;
        int sum = closest(nums, target);
        System.out.println(sum);
    }
    static int closest(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) {
                    return currentSum;
                }

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        return closestSum;
    }
}


