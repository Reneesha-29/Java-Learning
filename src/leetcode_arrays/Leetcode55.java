package leetcode_arrays;

public class Leetcode55 {
    static void main() {
        int nums[] = {2,3,1,1,4};
        int farthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Bug check: If the current index is unreachable, we are stuck!
            if (i > farthest) {
                System.out.println("false");
                return;
            }

            // Update the farthest index we can reach from here
            farthest = Math.max(farthest, i + nums[i]);

            // Optimization: If we can already reach the end, stop early
            if (farthest >= n - 1) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}